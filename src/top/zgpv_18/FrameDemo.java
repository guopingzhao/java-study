package top.zgpv_18;


import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.InputStream;

public class FrameDemo {
    private static Frame frame = new Frame("GUI");

    public static void main(String[] args) {
        init();
        renderMenuBar();
        renderLabel();
        renderTextAndButton();


        frame.setVisible(true);

    }

    static void init() {
        frame.setResizable(false);
        frame.setLayout(new FlowLayout());

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Dimension screenSize = toolkit.getScreenSize();

        double height = screenSize.getHeight();
        double width = screenSize.getWidth();

        frame.setBounds((int)(width - 600) / 2, (int)(height - 400) / 2, 600, 400);


        frame.addWindowListener(new WindowListenerImpl() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    static void renderMenuBar() {

        String title = frame.getTitle();

        MenuBar mb = new MenuBar();
        Menu m = new Menu("文件");
        Menu m2 = new Menu("更改名称");

        MenuItem mi = new MenuItem("打开浏览器");
        MenuItem mi2 = new MenuItem("好好学习");
        MenuItem mi3 = new MenuItem("恢复标题");
        MenuItem mi4 = new MenuItem("退出");

        m.add(m2);
        m2.add(mi);
        m2.add(mi2);
        m2.add(mi3);

        mb.add(m);

        mi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Runtime runtime = Runtime.getRuntime();
                try {
                    Process ls = runtime.exec("ls");
                    InputStream inputStream = ls.getInputStream();

                    byte[] bs = new byte[1024];
                    int len = 0;

                    while ((len = inputStream.read(bs)) != -1) {
                        System.out.print(new String(bs, 0, len));
                    }


                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        mi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle(mi2.getLabel());
            }
        });

        mi3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle(title);
            }
        });

        mi4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setMenuBar(mb);
    }

    static void renderLabel() {
        Label label = new Label("输入QQ");
        frame.add(label);
    }

    static void renderTextAndButton() {
        TextField tf = new TextField(20);
        Button button = new Button("转移");
        TextArea ta = new TextArea(10, 40);

//        button.setBounds(0, 0, 20, 10);
        tf.addKeyListener(new KeyListenerImpl() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if (!(ch >= '0' && ch <= '9')) {
                    System.out.println(ch);
                    System.out.println(tf.getText());
                    e.consume();
                }
            }
        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tft = tf.getText().trim();
                String tat = ta.getText().trim();

                ta.setText(tat.isEmpty() ? tft : tat + ", " + tft);
                tf.setText("");
            }
        });


        Button redButton = new Button("红色");
        redButton.addMouseListener(new MouseListenerImpl() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setBackground(Color.red);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                frame.setBackground(Color.blue);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                frame.setBackground(Color.white);
            }
        });

        frame.add(tf);
        frame.add(button);
        frame.add(ta);

        frame.add(redButton);

    }
}
