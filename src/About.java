import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    About() {
        init();
        setBounds(200, 200, 260, 160);
        setResizable(false); //不可改变大小
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //关闭窗体时，隐藏该窗体，并释放该窗体占用的资源。不可用EXIT_ON_CLOSE
    }

    void init() {
        Toolkit tool = this.getToolkit();
        Image ico = tool.getImage("src/images/icon.ico");
        this.setIconImage(ico);

        Box bx1, bx2;
        bx1 = Box.createVerticalBox();
        bx2 = Box.createHorizontalBox();
        bx1.add(new JLabel("工具名称： 普通计算器"));
        //bx1.add(Box.createVerticalStrut(10));
        bx1.add(new JLabel("工具版本： V1.0"));
        //bx1.add(Box.createVerticalStrut(10));
        bx1.add(new JLabel("开发时间： 2015/5/13"));
        //bx1.add(Box.createVerticalStrut(10));
        bx1.add(new JLabel("开发所属： 低语工程"));
        //bx1.add(Box.createVerticalStrut(10));
        bx1.add(new JLabel("联系我们： jixinwork@qq.com"));
        //bx1.add(Box.createVerticalStrut(10));
        bx2.add(bx1);

        ImageIcon icon = new ImageIcon("src/images/project.jpg");
        icon.setImage(icon.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));//设置图片大小
        JLabel tp = new JLabel(icon);//以标签来存图片
        JPanel jp1 = new JPanel();   //JPanel容器
        jp1.setLayout(null);       //把该容器设为空布局
        jp1.add(tp);               //加入图片标签组件
        tp.setBounds(2, 20, 70, 70);  //自定义标签图片在空布局中的位置
        bx2.add(jp1);
        add(bx2);
    }
}
