import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {

    public static void main(String args[]) {
        Win win = new Win();
        win.setTitle("计算器V1.0");
    }
}

class Win extends JFrame implements ActionListener {
    JTextArea text1, text2;
    JButton res, ini, del;
    JMenuItem cdx4;
    StringBuffer stb1;
    String[] st1;

    public Win() {
        init();
        Toolkit tool = this.getToolkit();    //设置窗口图标
        Image icon = tool.getImage("src/images/icon.ico"); //Image是抽象类
        this.setIconImage(icon);           //设置图标

        setResizable(false); //不可改变大小
        setBounds(200, 200, 280, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        JMenuBar cdt = new JMenuBar();
        JMenu cd1 = new JMenu("菜单");
        JMenu cd2 = new JMenu("帮助");
        JMenuItem cdx1 = new JMenuItem("设置");
        JMenuItem cdx2 = new JMenuItem("音效");
        cd1.add(cdx1);
        cd1.add(cdx2);
        JMenuItem cdx3 = new JMenuItem("帮助");
        cdx4 = new JMenuItem("联系我们");
        cdx4.addActionListener(this);
        cd2.add(cdx3);
        cd2.add(cdx4);
        cdt.add(cd1);
        cdt.add(cd2);
        setJMenuBar(cdt);//将菜单条添加到窗体，用这个，不用add

        stb1 = new StringBuffer();
        text1 = new JTextArea();
        text2 = new JTextArea();
        text1.setEditable(false);
        text2.setEditable(false);
        JSplitPane cf1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, true, text1, text2);
        add(cf1, BorderLayout.NORTH);

        //Box box1, box2, box3;
        GridLayout gri2 = new GridLayout(5, 1);
        JPanel jp2 = new JPanel(gri2);
        //box1 = Box.createVerticalBox();
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");
        JButton squ = new JButton("^");
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        squ.addActionListener(this);
        jp2.add(add);
        jp2.add(sub);
        jp2.add(mul);
        jp2.add(div);
        jp2.add(squ);

        GridLayout gri3 = new GridLayout(5, 1);
        JPanel jp3 = new JPanel(gri3);
        //box2 = Box.createVerticalBox();
        JButton sin = new JButton("sin");
        JButton cos = new JButton("cos");
        JButton tan = new JButton("tan");
        JButton sqrt = new JButton("sqrt");
        del = new JButton("del");
        sin.addActionListener(this);
        cos.addActionListener(this);
        tan.addActionListener(this);
        sqrt.addActionListener(this);
        del.addActionListener(this);
        jp3.add(sin);
        jp3.add(cos);
        jp3.add(tan);
        jp3.add(sqrt);
        jp3.add(del);
        JSplitPane cf3 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, jp2, jp3);
        //box3 = Box.createHorizontalBox();
        //box3.add(box1);
        //box3.add(box2);

        GridLayout gri1 = new GridLayout(5, 3);
        JPanel jp1 = new JPanel(gri1);
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton thr = new JButton("3");
        JButton fou = new JButton("4");
        JButton fiv = new JButton("5");
        JButton six = new JButton("6");
        JButton sev = new JButton("7");
        JButton egi = new JButton("8");
        JButton nin = new JButton("9");
        JButton zer = new JButton("0");
        JButton zkh = new JButton("(");
        JButton ykh = new JButton(")");
        JButton dot = new JButton(".");
        res = new JButton("=");
        ini = new JButton("C");
        one.addActionListener(this);
        two.addActionListener(this);
        thr.addActionListener(this);
        fou.addActionListener(this);
        fiv.addActionListener(this);
        six.addActionListener(this);
        sev.addActionListener(this);
        egi.addActionListener(this);
        nin.addActionListener(this);
        zer.addActionListener(this);
        zkh.addActionListener(this);
        ykh.addActionListener(this);
        dot.addActionListener(this);
        res.addActionListener(this);
        ini.addActionListener(this);
        jp1.add(one);
        jp1.add(two);
        jp1.add(thr);
        jp1.add(fou);
        jp1.add(fiv);
        jp1.add(six);
        jp1.add(sev);
        jp1.add(egi);
        jp1.add(nin);
        jp1.add(zer);
        jp1.add(zkh);
        jp1.add(ykh);
        jp1.add(dot);
        jp1.add(res);
        jp1.add(ini);

        Keyboard2View bd = new Keyboard2View();//将按钮绑定到键盘上
        InputMap ipone = one.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ipone.put(KeyStroke.getKeyStroke("1"), "bd1");
        ActionMap atone = one.getActionMap();
        atone.put("bd1", bd);
        InputMap iptwo = two.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        iptwo.put(KeyStroke.getKeyStroke("2"), "bd2");
        ActionMap attwo = two.getActionMap();
        attwo.put("bd2", bd);
        InputMap ipthr = thr.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ipthr.put(KeyStroke.getKeyStroke("3"), "bd3");
        ActionMap atthr = thr.getActionMap();
        atthr.put("bd3", bd);
        InputMap ipfou = fou.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ipfou.put(KeyStroke.getKeyStroke("4"), "bd4");
        ActionMap atfou = fou.getActionMap();
        atfou.put("bd4", bd);
        InputMap ipfiv = fiv.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ipfiv.put(KeyStroke.getKeyStroke("5"), "bd5");
        ActionMap atfiv = fiv.getActionMap();
        atfiv.put("bd5", bd);
        InputMap ipsix = six.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ipsix.put(KeyStroke.getKeyStroke("6"), "bd6");
        ActionMap atsix = six.getActionMap();
        atsix.put("bd6", bd);
        InputMap ipsev = sev.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ipsev.put(KeyStroke.getKeyStroke("7"), "bd7");
        ActionMap atsev = sev.getActionMap();
        atsev.put("bd7", bd);
        InputMap ipegi = egi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ipegi.put(KeyStroke.getKeyStroke("8"), "bd8");
        ActionMap ategi = egi.getActionMap();
        ategi.put("bd8", bd);
        InputMap ipnin = nin.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ipnin.put(KeyStroke.getKeyStroke("9"), "bd9");
        ActionMap atnin = nin.getActionMap();
        atnin.put("bd9", bd);
        InputMap ipzer = zer.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ipzer.put(KeyStroke.getKeyStroke("0"), "bd0");
        ActionMap atzer = zer.getActionMap();
        atzer.put("bd0", bd);

        JSplitPane cf2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, cf3, jp1);
        add(cf2);
    }

    public void actionPerformed(ActionEvent e) {
        //JButton b1 = (JButton) e.getSource();
        Object b1 = e.getSource();  //不用上面的强制类型转换也行，推荐用这个
        if (b1 == res) {
            String stt = new String(stb1);   //将StringBuffer转换为String
            stt = stt.replace("-", " -1.01002 ");
            stt = stt.replace("sin", " -1.01101 ");
            stt = stt.replace("cos", " -1.01102 ");
            stt = stt.replace("tan", " -1.01103 ");
            stt = stt.replace("sqrt", " -1.01104 ");
            stt = stt.replace("+", " -1.01001 ");
            stt = stt.replace("*", " -1.01003 ");
            stt = stt.replace("/", " -1.01004 ");
            stt = stt.replace("^", " -1.01005 ");
            stt = stt.replace("(", " -1.01006 ");
            stt = stt.replace(")", " -1.01007 ");
            st1 = stt.split("\\s");
            //text2.setText(stt);
            try {
                jisuan();
            } catch (Exception ex) {
                text2.setText("对不起，您的输入有误，请检查");
            }
        } else if (b1 == ini) {
            text1.setText("");
            text2.setText("");
            stb1.delete(0, stb1.length());
            return;
        } else if (b1 == del) {
            if (stb1.charAt(stb1.length() - 1) == 'n' || stb1.charAt(stb1.length() - 1) == 's') {
                stb1.delete(stb1.length() - 3, stb1.length());
            } else if (stb1.charAt(stb1.length() - 1) == 't') {
                stb1.delete(stb1.length() - 4, stb1.length());
            } else {
                stb1.delete(stb1.length() - 1, stb1.length());
            }
            String stk = new String(stb1);
            text1.setText(stk);
            return;
        } else if (b1 == cdx4) {
            About about = new About();
            about.setTitle("联系我们");
            return;
        } else {
            String stk = new String(stb1);
            if (stk.contains("=")) {
                text1.setText("");
                text2.setText("");
                stb1.delete(0, stb1.length());
            }
        }
        text1.append(e.getActionCommand());
        stb1.append(e.getActionCommand());
    }

    public void jisuan() {
        Double p[] = new Double[1000];
        Double q[] = new Double[1000];
        Stack<Double> pp = new Stack<Double>();
        pp.clear();
        /*
        for(int i=0;i<st1.length;i++)
        {
              System.out.println(st1[i]);
        }*/
        int r = 0, jk = 0;
        for (int i = 0; i < st1.length; i++) {
            if (st1[i].length() == 0) {
                continue;
            } else {
                //System.out.println(st1[i]);
                //text2.append(st1[i]+" ");
                p[jk++] = Double.parseDouble(st1[i]);
            }
        }
        for (int i = 0; i < jk; i++) {
            if (p[i] == -1.01101 || p[i] == -1.01102 || p[i] == -1.01103 || p[i] == -1.01104) {
                pp.push(p[i]);
            } else if (p[i] == -1.01001 || p[i] == -1.01002) {
                if (i == 0 || p[i - 1] == -1.01001 || p[i - 1] == -1.01002 || p[i - 1] == -1.01003 || p[i - 1] == -1.01004 || p[i - 1] == -1.01005 || p[i - 1] == -1.01006) {
                    if (p[i] == -1.01001) {
                        i++;
                        q[r++] = p[i];
                        //System.out.println(pp.peek());
                        //System.out.println(jk);
                        continue;
                    } else if (p[i] == -1.01002) {
                        i++;
                        q[r++] = -p[i];
                        //System.out.println(i);
                        //System.out.println(pp.peek());
                        continue;
                    }
                }
                while (!pp.empty() && (pp.peek() != -1.01006)) {
                    q[r++] = pp.peek();
                    pp.pop();
                }
                pp.push(p[i]);
            } else if (p[i] == -1.01003 || p[i] == -1.01004) {
                while (!pp.empty() && (pp.peek() == -1.01003 || pp.peek() == -1.01004 || pp.peek() == -1.01005)) {
                    q[r++] = pp.peek();
                    pp.pop();
                }
                pp.push(p[i]);
            } else if (p[i] == -1.01005) {
                pp.push(p[i]);
            } else if (p[i] == -1.01006) {
                pp.push(p[i]);
            } else if (p[i] == -1.01007) {
                if (pp.empty())    //应对“8）=”的情况
                {
                    text2.setText("请注意括号的匹配问题，可能缺少“(”");
                    return;
                }
                while (pp.peek() != -1.01006) {
                    q[r++] = pp.peek();
                    //System.out.print(q[r-1]);
                    pp.pop();
                    if (pp.empty()) {
                        text2.setText("请注意括号的匹配问题，可能缺少“(”");
                        return;
                    }
                }
                //System.out.print(pp.peek());
                pp.pop();
                //System.out.print(pp.empty());
                //下面一定要先判断栈中是否还有元素，没写则程序出错！！！！！
                if (!pp.empty() && (pp.peek() == -1.01101 || pp.peek() == -1.01102 || pp.peek() == -1.01103 || pp.peek() == -1.01104)) {
                    q[r++] = pp.peek();
                    pp.pop();
                }
            } else {
                q[r++] = p[i];
                //System.out.print(q[r-1]);
            }
        }
        while (!pp.empty()) {
            if (pp.peek() == -1.01006) {
                text2.setText("请注意括号的匹配问题，可能缺少“）”");
                return;
            }
            q[r++] = pp.peek();
            pp.pop();
        }
        double a, b;
        for (int j = 0; j < r; j++) {
            if (q[j] == -1.01101) {
                a = pp.peek();
                pp.pop();
                pp.push(Math.sin(a * Math.PI / 180));  //换为熟悉的角度制
            } else if (q[j] == -1.01102) {
                a = pp.peek();
                pp.pop();
                pp.push(Math.cos(a * Math.PI / 180));
            } else if (q[j] == -1.01103) {
                a = pp.peek();
                pp.pop();
                pp.push(Math.tan(a * Math.PI / 180));
            } else if (q[j] == -1.01104) {
                a = pp.peek();
                pp.pop();
                pp.push(Math.sqrt(a));
            } else if (q[j] == -1.01001) {
                b = pp.peek();
                pp.pop();
                a = pp.peek();
                pp.pop();
                pp.push(a + b);
            } else if (q[j] == -1.01002) {
                b = pp.peek();
                pp.pop();
                a = pp.peek();
                pp.pop();
                pp.push(a - b);
            } else if (q[j] == -1.01003) {
                b = pp.peek();
                pp.pop();
                a = pp.peek();
                pp.pop();
                pp.push(a * b);
            } else if (q[j] == -1.01004) {
                b = pp.peek();
                pp.pop();
                a = pp.peek();
                pp.pop();
                pp.push(a * 1.0 / b);
            } else if (q[j] == -1.01005) {
                b = pp.peek();
                pp.pop();
                a = pp.peek();
                pp.pop();
                pp.push(Math.pow(a, b));
            } else {
                pp.push(q[j]);
            }
        }
        text2.setText(pp.peek().toString());
        pp.pop();
    }

    class Keyboard2View extends AbstractAction { //内部类，可以操作外部类的属性和函数
        public void actionPerformed(ActionEvent e) {
            String stk = new String(stb1);
            if (stk.contains("=")) {
                text1.setText("");
                text2.setText("");
                stb1.delete(0, stb1.length());
            }
            text1.append(e.getActionCommand());
            stb1.append(e.getActionCommand());
        }
    }
}

