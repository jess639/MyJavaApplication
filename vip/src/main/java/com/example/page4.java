package com.example;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

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

public class page4 extends JPanel implements ItemListener,TableModelListener{

	JButton jButton1;
	private JTabbedPane mJTabbedPane = null;
	private JTable table = null;
	private  MyTable90 my = null;

	public void setSelectedComponent() {
		Main.tab.setSelectedComponent(Main.pan5);
	}

	public page4() {
		initComponents();
	};

	public void initComponents() {
		Handle2 handle2 = new Handle2(page4.this);
		jButton1 = new JButton("ȷ��");
		jButton1.setPreferredSize(new Dimension(100,50));
		jButton1.addActionListener(handle2);

		my = new MyTable90();
		my.addTableModelListener(this);

		table = new JTable(my);

		DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
		cr.setHorizontalAlignment(JLabel.RIGHT);
		table.setDefaultRenderer(Object.class, cr);

		table.setPreferredScrollableViewportSize(new Dimension(1100, 700));
		table.setRowHeight(55);

		TableColumnModel colmodel = table.getColumnModel();

//		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//		colmodel.getColumn(0).setPreferredWidth(100+30+a);

		JScrollPane scr = new JScrollPane(table) ;
		scr.setPreferredSize(new Dimension(1100,700));

		setLayout(new BorderLayout(2,1));
		add(scr,BorderLayout.CENTER) ;
		add(jButton1,BorderLayout.SOUTH);
	}


	@Override
	public void itemStateChanged(ItemEvent arg0) {
	}

	class  Handle2 implements ActionListener            //��ʵ��ĳ�ӿ�

	{

		protected page4 newjframe;

		public Handle2(page4 newjframe) // ���캯��
		{
			this.newjframe = newjframe;
		}
		public void actionPerformed(ActionEvent e)               //��ʵ�ָýӿ��е����з��� 

		{
			if(e.getActionCommand().equals("ȷ��"))//��Red��ť�¼�
			{

				new page2();
//				 
				setSelectedComponent();
			}
		}
	}

	@Override
	public void tableChanged(TableModelEvent e) {
		int row = e.getFirstRow();
		int col = e.getColumn();

		Double grade1 = (double) ((Double) table.getValueAt(row, col)).intValue();

		if(row==0&&col==2){
			vip.F48=grade1;
		}else if(row==1&&col==2){
			vip.F49=grade1;
		}else if(row==2&&col==2){
			vip.F50=grade1;
		}else if(row==3&&col==2){
			vip.F52=grade1;
		}//1111111111111111111111

		else if(row==4&&col==2){
			vip.F53=grade1;
		}else if(row==5&&col==2){
			vip.F54=grade1;
		}else if(row==6&&col==2){
			vip.F55=grade1;
		}else if(row==7&&col==2){
			vip.F62=grade1;
		}//2222222222222222222222

		else if(row==8&&col==2){
			vip.F63=grade1;
		}else if(row==9&&col==2){
			vip.F64=grade1;
			if(grade1==0){
				vip.F6400=0;
			}else if(grade1>0){
				vip.F6400=1;
			}
		}else if(row==10&&col==2){
			vip.F65=grade1;
			if(grade1==0){
				vip.F6500=0;
			}else if(grade1>0){
				vip.F6500=1;
			}
		}else if(row==11&&col==2){
			vip.F66=grade1;
		}//3333333333333333333333

		else if(row==12&&col==2){
			vip.F67=grade1;
		}else if(row==13&&col==2){
			vip.F70=grade1;
		}else if(row==14&&col==2){
			vip.F71=grade1;
		}//4444444444444444444444

		else if(row==0&&col==4){
			vip.G48=grade1;
		}else if(row==1&&col==4){
			vip.G49=grade1;
		}else if(row==2&&col==4){
			vip.G50=grade1;
		}else if(row==3&&col==4){
			vip.G52=grade1;
		}//1111111111111111111111

		else if(row==4&&col==4){
			vip.G53=grade1;
		}else if(row==5&&col==4){
			vip.G54=grade1;
		}else if(row==6&&col==4){
			vip.G55=grade1;
		}else if(row==7&&col==4){
			vip.G62=grade1;
		}//2222222222222222222222

		else if(row==8&&col==4){
			vip.G63=grade1;
		}else if(row==9&&col==4){
			vip.G64=grade1;
			if(grade1==0){
				vip.G6400=0;
			}else if(grade1>0){
				vip.G6400=1;
			}

		}else if(row==10&&col==4){
			vip.G65=grade1;
			if(grade1==0){
				vip.G6500=0;
			}else if(grade1>0){
				vip.G6500=1;
			}
		}else if(row==11&&col==4){
			vip.G66=grade1;
		}//3333333333333333333333

		else if(row==12&&col==4){
			vip.G67=grade1;
		}else if(row==13&&col==4){
			vip.G70=grade1;
		}else if(row==14&&col==4){
			vip.G71=grade1;
		}//4444444444444444444444 

		vip.newvip=1;
		System.out.println("tabekChanged....row="+row+"...col="+col+"�ı����ݺ�="+grade1);
	}
}

class MyTable90 extends AbstractTableModel {
	// ʹ��AbstractTableModel���������ģ��
	Object[][] p = {
			{"�����","���� ",vip.F48,"mm",vip.G48,"mm"},
			{"","��� ",vip.F49,"mm",vip.G49,"mm"},
			{"","�Ҳ� ",vip.F50,"mm",vip.G50,"mm"},
			{"","����",vip.F52,"mm",vip.G52,"mm"},
			{"","����ʣ��",vip.F53,"mm",vip.G53,"mm"},
			{"","����",vip.F54,"mm",vip.G54,"mm"},
			{"","����",vip.F55,"mm",vip.G55,"mm"},
			{"�䶳��","�����",vip.F62,"mm",vip.G62,"mm"},
			{"","�Ҳ���",vip.F63,"mm",vip.G63,"mm"},
			{"","�����",vip.F64,"mm",vip.G64,"mm"},
			{"","�Ҳ���",vip.F65,"mm",vip.G65,"mm"},
			{"","�ײ�",vip.F66,"mm",vip.G66,"mm"},
			{"","����",vip.F67,"mm",vip.G67,"mm"},
			{"","����",vip.F70,"mm",vip.G70,"mm"},
			{"","����",vip.F71,"mm",vip.G71,"mm"}
	};

	String[] n = { "","","","","",""};

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
		// �жϵ�Ԫ���Ƿ���Ա༭
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
 