package com.example;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;


import javax.swing.BorderFactory;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;


@SuppressWarnings("unused")
public class Main {
	public static JTabbedPane tab = null;
	public static Container cont = null;
	public static JFrame frame = null;
	public static JPanel pan1,pan2,pan3,pan4,pan5,pan6;
	public  JTabbedPane getJTabbedPane(){
		return tab;
	}

	public static void main(String args[]){
		frame = new JFrame("��������վ��Ȱ������Ż�ƥ�����"+ vip.version) ; // ʵ�����������
		cont = frame.getContentPane() ;
		tab = new JTabbedPane(JTabbedPane.LEFT) ;// ���ñ�ǩ�ڶ�����ʾ
		pan1 = new JPanel() ;//�����ҳ
		pan2 = new JPanel() ;//��Ʋ���
		pan3 = new JPanel() ;//����ߴ�
		pan4 = new JPanel() ;//VIP�ߴ�
		pan5 = new JPanel() ;//ƥ����1
		pan6 = new JPanel() ;//ƥ����2
		page1 cardPanel0 = new page1();//11111111111111111
		page2 cardPanel2 = new page2();//22222222222222222
		page3 cardPanel1 = new page3();//33333333333333333
		page4 cardPanel10 = new page4();//4444444444444444
		MyPanel myPanel = new MyPanel();//5555555555555555
		MyPanel1 myPanel1 = new MyPanel1();//6666666666666
/*******************************************************************************************************************************************************/
		//pan1  page 1
		cardPanel0.setVisible(true);
		cardPanel0.setJTabbedPane(tab,pan2,cardPanel2,cardPanel1,cardPanel10,myPanel,myPanel1);
		cardPanel0.setPreferredSize(new Dimension(1100,700));
		pan1.add(cardPanel0,BorderLayout.CENTER);
		pan1.setBorder(BorderFactory.createTitledBorder("�����ҳ")) ;
/*******************************************************************************************************************************************************/
		//pan2  page 2
		cardPanel2.setVisible(false);
		cardPanel2.setPreferredSize(new Dimension(900,800));
		JScrollPane src = new JScrollPane(cardPanel2) ;
		src.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);//
		src.setPreferredSize(new Dimension(1000,700));
		pan2.setLayout(new BorderLayout(2,1));
		pan2.add(src,BorderLayout.CENTER) ;
		pan2.setBorder(BorderFactory.createTitledBorder("��Ʋ���")) ;
/*******************************************************************************************************************************************************/
		//pan3  page 3
		cardPanel1.setVisible(false);
		pan3.setLayout(new BorderLayout(2,1));
		JScrollPane src1 = new JScrollPane(cardPanel1) ;
		src1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);//
		src1.setPreferredSize(new Dimension(1000,800));
		pan3.add(cardPanel1,BorderLayout.CENTER);
		pan3.setBorder(BorderFactory.createTitledBorder("����ߴ�"));
/*******************************************************************************************************************************************************/
		//pan4  page 4
		cardPanel10.setVisible(false);
		pan4.setLayout(new BorderLayout(2,1));
		JScrollPane src2 = new JScrollPane(cardPanel10) ;
		src2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);//
		src2.setPreferredSize(new Dimension(1000,700));
		pan4.add(src2,BorderLayout.CENTER);
		pan4.setBorder(BorderFactory.createTitledBorder("VIP�ߴ�"));
/*******************************************************************************************************************************************************/
		//pan5 page 5
		myPanel.setVisible(false);
		myPanel.setPreferredSize(new Dimension(1100,800));
		JScrollPane src3 = new JScrollPane(myPanel) ;
		src3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);//
		src3.setPreferredSize(new Dimension(1000,700));
		pan5.setLayout(new BorderLayout(2,1));
		pan5.add(src3,BorderLayout.CENTER) ;
		pan5.setBorder(BorderFactory.createTitledBorder("ƥ����1")) ;
/*******************************************************************************************************************************************************/
		//pan6 page 6
		myPanel1.setVisible(false);
		myPanel1.setPreferredSize(new Dimension(1100,700));
		pan6.setLayout(new BorderLayout(2,1));
		pan6.add(myPanel1,BorderLayout.CENTER) ;
		pan6.setBorder(BorderFactory.createTitledBorder("ƥ����2")) ;

		tab.addTab("�����ҳ",pan1) ;
		tab.addTab("��Ʋ���",pan2) ;
		tab.addTab("����ߴ�",pan3) ;
		tab.addTab("VIP�ߴ�",pan4) ;
		tab.addTab("ƥ����1",pan5) ;
		tab.addTab("ƥ����2",pan6) ;
		cont.add(tab);

		frame.setSize(1100,1400) ;// ��������Զ�������С
		frame.setLocation(0,0) ;
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true) ;
	}

};