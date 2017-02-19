package com.example;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class page3 extends JPanel implements ItemListener,TableModelListener{

	JButton jButton1;
	private JTabbedPane mJTabbedPane = null;
	private JTable table = null;
	private  MyTable9 my = null;

	public void setJTabbedPane(JTabbedPane mJTabbedPane) {
		this.mJTabbedPane = mJTabbedPane;
	}

	public void setSelectedComponent() {
		Main.tab.setSelectedComponent(Main.pan4);
	}

	public page3() {
		initComponents();
	};

	public void initComponents() {
		Handle2 handle2 = new Handle2(page3.this);
		jButton1 = new JButton("确定");
		jButton1.setPreferredSize(new Dimension(100,50));
		jButton1.addActionListener(handle2);

		my = new MyTable9();
		my.addTableModelListener(this);

		table = new JTable(my);

		DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
		cr.setHorizontalAlignment(JLabel.RIGHT);
		table.setDefaultRenderer(Object.class, cr);

		table.setPreferredScrollableViewportSize(new Dimension(1100, 850));
		table.setRowHeight(32);

		TableColumnModel colmodel = table.getColumnModel();

		// Set column widths
		int a=7;
//		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		colmodel.getColumn(0).setPreferredWidth(100+30+a);
		colmodel.getColumn(1).setPreferredWidth(100+30+a);
		colmodel.getColumn(2).setPreferredWidth(100+30+a);
		colmodel.getColumn(3).setPreferredWidth(100+30+a);
		colmodel.getColumn(4).setPreferredWidth(1);
		colmodel.getColumn(5).setPreferredWidth(100+30+a);
		colmodel.getColumn(6).setPreferredWidth(100+30+a);
		colmodel.getColumn(7).setPreferredWidth(100+30+a);
		colmodel.getColumn(8).setPreferredWidth(100+30+a);

		JScrollPane scr = new JScrollPane(table) ;
		scr.setPreferredSize(new Dimension(1100,1000));

		setLayout(new BorderLayout(2,1));
		add(scr,BorderLayout.CENTER) ;
		add(jButton1,BorderLayout.SOUTH);
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
	}

	class  Handle2 implements ActionListener            //①实现某接口

	{
		protected page3 newjframe;

		public Handle2(page3 newjframe) // 构造函数
		{
			this.newjframe = newjframe;
		}
		public void actionPerformed(ActionEvent e)               //②实现该接口中的所有方法 

		{
			if(e.getActionCommand().equals("确定"))//是Red按钮事件
			{
				new page2();
//				 
				setSelectedComponent();
			}
		}
	}

	@Override
	public void tableChanged(TableModelEvent e) {
		// TODO Auto-generated method stub

		int row = e.getFirstRow();
		int col = e.getColumn();

		Double grade1 = ((Double) table.getValueAt(row, col)).doubleValue();
		System.out.println("tabekChanged grade1="+grade1);
		if(row==0&&col==2){
			vip.B5=grade1;
		}else if(row==1&&col==2){
			vip.C5=grade1;
		}else if(row==2&&col==2){
			vip.D5=grade1;
		}else if(row==3&&col==2){
			vip.Q5=grade1;
		}//111111111111111111111

		else if(row==4&&col==2){
			vip.R5=grade1;
		}else if(row==5&&col==2){
			vip.S5=grade1;
		}else if(row==6&&col==2){
			vip.X5=grade1;
		}else if(row==7&&col==2){
			vip.bianwen=grade1;
		}//2222222222222222222222

		else if(row==8&&col==2){
			vip.bianwen=grade1;
		}else if(row==9&&col==2){
			vip.bianwen=grade1;
		}else if(row==10&&col==2){
			vip.bianwen=grade1;
		}else if(row==11&&col==2){
			vip.AD5=grade1;
		}//3333333333333333333333

		else if(row==12&&col==2){
			vip.AE5=grade1;
		}else if(row==13&&col==2){
			vip.AF5=grade1;
		}else if(row==14&&col==2){
			vip.AL5=grade1;
		}else if(row==15&&col==2){
			vip.AG5=grade1;
		}//44444444444444444444444

		else if(row==16&&col==2){
			vip.L5=grade1;
		}else if(row==17&&col==2){
			vip.N5=grade1;
		}else if(row==18&&col==2){
			vip.O5=grade1;
		}else if(row==19&&col==2){
			vip.P5=grade1;
		}//55555555555555555555555

		else if(row==20&&col==2){
			vip.E5=grade1;
		}else if(row==21&&col==2){
			vip.T5=grade1;
		}else if(row==22&&col==2){
			vip.bianwen=grade1;
		}else if(row==23&&col==2){
			vip.AH5=grade1;
		}//66666666666666666666666

		else if(row==24&&col==2){
			vip.Y5=grade1;
		}else if(row==25&&col==2){
			vip.Z5=grade1;
		}else if(row==26&&col==2){
			vip.AA5=grade1;
		}//77777777777777777777777

		else if(row==0&&col==7){
			vip.K5=grade1;
		}else if(row==1&&col==7){
			vip.C5=grade1;//0.037
		}else if(row==2&&col==7){
			vip.AB5=grade1;
		}else if(row==3&&col==7){
			vip.AC5=grade1;
		}//1111111111111111111111

		else if(row==4&&col==7){
			vip.bianwen=grade1;
		}else if(row==5&&col==7){
			vip.bianwen=grade1;
		}else if(row==6&&col==7){
			vip.AM5=grade1;
		}else if(row==7&&col==7){
			vip.AN5=grade1;
		}//2222222222222222222222

		else if(row==8&&col==7){
			vip.C18=grade1;
		}else if(row==9&&col==7){
			vip.bianwen=grade1;
		}else if(row==10&&col==7){
			vip.C19=grade1;
		}else if(row==11&&col==7){
			vip.C20=grade1;
		}//33333333333333333333333

		else if(row==12&&col==7){
			vip.C22=grade1;//冷凝
		}else if(row==13&&col==7){
			vip.C23=grade1;//冷藏蒸发器
		}else if(row==14&&col==7){
			vip.C21=grade1;//冷冻蒸发器
		}else if(row==15&&col==7){
			vip.C24=grade1;// 
		}//44444444444444444444444

		else if(row==16&&col==7){
			vip.U5=grade1;//1.8
		}else if(row==17&&col==7){
			vip.U5=grade1;
		}else if(row==18&&col==7){
			vip.V5=grade1;
		}else if(row==19&&col==7){
			vip.W5=grade1;
		}//55555555555555555555555

		else if(row==20&&col==7){
			vip.AI5=grade1;
		}else if(row==21&&col==7){
			vip.AJ5=grade1;
		}else if(row==22&&col==7){
			vip.AK5=grade1;
		}else if(row==23&&col==7){
			vip.B8=grade1;
		}//66666666666666666666666

	}
}

class MyTable9 extends AbstractTableModel {
	// 使用AbstractTableModel来创建表格模型
	DecimalFormat d4f = new DecimalFormat("#.0000");//4位小数
	Object[][] p = {
			{"箱体尺寸","箱体宽度",vip.B5,"mm","","门封条参数","门封条厚度",vip.K5,"mm"},
			{"","箱体深度",vip.C5,"mm","","","门封条漏热系数",Double.parseDouble(String.valueOf(0.037)),"mm"},
			{"","箱体高度",vip.D5,"mm","","","冷藏门封条宽度",vip.AB5,"mm"},
			{"冷藏室尺寸参数","冷藏顶部",vip.Q5,"mm","","","冷藏门封条高度",vip.AC5,"mm"},
			{"","冷藏两侧",vip.R5,"mm","","","变温门封条宽度",vip.bianwen,"mm"},
			{"","冷藏后背",vip.S5,"mm","","","变温门封条高度",vip.bianwen,"mm"},
			{"","冷藏内部高度",vip.X5,"mm","","","冷冻门封条宽度",vip.AM5,"mm"},
			{"变温室尺寸参数","变温顶部",vip.bianwen,"mm","","","冷冻门封条高度",vip.AN5,"mm"},
			{"","变温两侧",vip.bianwen,"mm","","制冷系统参数","冷藏室特性温度",vip.C18,"℃"},
			{"","变温后背",vip.bianwen,"mm","","","变温室特性温度",vip.bianwen,"℃"},
			{"","变温内部高度",vip.bianwen,"mm","","","冷冻室特性温度",vip.C19,"℃"},
			{"冷冻室尺寸参数","冷冻顶部",vip.AD5,"mm","","","压机室温度",vip.C20,"℃"},
			{"","冷冻两侧",vip.AE5,"mm","","","冷凝温度",vip.C22,"℃"},
			{"","冷冻后背",vip.AF5,"mm","","","冷藏蒸发器",vip.C23,"℃"},
			{"","冷冻内部高度",vip.AL5,"mm","","","冷冻蒸发器",vip.C21,"℃"},
			{"","冷冻底部",vip.AG5,"mm","","","压缩机制冷量",vip.C24,"W"},
			{"压机室尺寸","压机室高度",vip.L5,"mm","","","COP",Double.parseDouble(String.valueOf(1.8)),""},
			{"","压机室深度",vip.N5,"mm","","冷藏室蒸发室尺寸","宽度",vip.U5,"mm"},
			{"","压机室顶厚度",vip.O5,"mm","","","高度",vip.V5,"mm"},
			{"","压机室侧厚度",vip.P5,"mm","","","深度",vip.W5,"mm"},
			{"门体尺寸","门体饰条厚度",vip.E5,"mm","","冷冻室蒸发室尺寸","宽度",vip.AI5,"mm"},
			{"","冷藏门体发泡层厚度",vip.T5,"mm","","","高度",vip.AJ5,"mm"},
			{"","变温门体发泡层厚度",vip.bianwen,"mm","","","深度",vip.AK5,"mm"},
			{"","冷冻门体发泡层厚度",vip.AH5,"mm","","其它参数","发泡层导热系数",vip.B8,""},
			{"冷藏室翻转梁","长度",vip.Y5,"mm","","","发泡料类型R",vip.fapaoleixing,""},
			{"","宽度",vip.Z5,"mm","","","冰箱冷藏制冷工况修正COP",vip.C26,""},
			{"","厚度",vip.AA5,"mm","","","冷冻制冷工况修正COP",vip.C27,""}
	};

	String[] n = { "","","","","","","","",""};

	@Override
	public int getRowCount() {
		return p.length;
	}

	@Override
	public int getColumnCount() {
		return n.length;
	}

	@Override
	public Object getValueAt(int row, int col) {
		return p[row][col];
	}

	@Override
	public String getColumnName(int col) {
		return n[col];
	}

	@Override
	public Class<?> getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// 判断单元格是否可以编辑
		return true;
	}

	@Override
	public void setValueAt(Object value, int row, int col) {
		p[row][col] = value;
		fireTableCellUpdated(row, col);
	}

	public void mySetValueAt(Object value, int row, int col) {
		p[row][col] = value;
	}

}
 