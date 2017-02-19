package com.example;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

public class page2 extends JPanel implements ItemListener {

	private ButtonGroup buttonGroup1;
	private JButton jButton1;
	private JCheckBox jCheckBox1;
	private JCheckBox jCheckBox10;
	private JCheckBox jCheckBox2;
	private JCheckBox jCheckBox3;
	private JCheckBox jCheckBox4;
	private JCheckBox jCheckBox5;
	private JCheckBox jCheckBox6;
	private JCheckBox jCheckBox7;
	private JCheckBox jCheckBox8;
	private JCheckBox jCheckBox9;
	private JComboBox jComboBox1;
	private JComboBox jComboBox10;
	private JComboBox jComboBox11;
	private JComboBox jComboBox12;
	private JComboBox jComboBox13;
	private JComboBox jComboBox14;
	private JComboBox jComboBox2;
	private JComboBox jComboBox3;
	private JComboBox jComboBox4;
	private JComboBox jComboBox5;
	private JComboBox jComboBox6;
	private JComboBox jComboBox7;
	private JComboBox jComboBox8;
	private JComboBox jComboBox9;
	private JLabel jLabel1;
	private JLabel jLabel10;
	private JLabel jLabel11;
	private JLabel jLabel12;
	private JLabel jLabel13;
	private JLabel jLabel14;
	private JLabel jLabel15;
	private JLabel jLabel16;
	private JLabel jLabel17;
	private JLabel jLabel18;
	private JLabel jLabel19;
	private JLabel jLabel2;
	private JLabel jLabel20;
	private JLabel jLabel21;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JPanel jPanel0;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JPanel jPanel3;
	private JPanel jPanel4;
	private JPanel jPanel5;
	private JRadioButton jRadioButton1;
	private JRadioButton jRadioButton2;
	private TextField text1;
	private TextField text2;
	private TextField text3;

	public void setSelectedComponent() {
		Main.tab.setSelectedComponent(Main.pan3);
	}

	DecimalFormat df = new DecimalFormat("#.00");// ±£¡Ù¡ΩŒª–° ˝

	public page2() {
		initComponents();

		double B5 = vip.B5, C5 = vip.C5, D5 = vip.D5, E5 = vip.E5, K5 = vip.K5, L5 = vip.L5, N5 = vip.N5, O5 = vip.O5, Q5 = vip.Q5, R5 = vip.R5, S5 = vip.S5, T5 = vip.T5, U5 = vip.U5, V5 = vip.V5, W5 = vip.W5, X5 = vip.X5, Y5 = vip.Y5, Z5 = vip.Z5, AA5 = vip.AA5, AB5 = vip.AB5, AC5 = vip.AC5, AD5 = vip.AD5, AE5 = vip.AE5, AF5 = vip.AF5, AG5 = vip.AG5, AH5 = vip.AH5, AI5 = vip.AI5, AJ5 = vip.AJ5, AK5 = vip.AK5, AL5 = vip.AL5, AM5 = vip.AM5, AN5 = vip.AN5, P5 = vip.P5;
		double pow6 = Math.pow(10, -6), pow3 = Math.pow(10, -3), pow33 = Math.pow(10, 3);
		double B8 =vip.B8, B9 = vip.heatness, B11 =vip.B11, B12 =vip.B12, C8 =vip.C8,C9 =vip.C9, E8=vip.E8,E9=vip.E9,F8=vip.F8,F9=vip.F9;
		double C17 = vip.C17,C18 = vip.C18, C19 = vip.C19, C20 = vip.C20, C21 =vip.C21, C22 =vip.C22, C23 = vip.C23, C24 = vip.C24, C26 = vip.C26, C27 =vip.C27, C28 = vip.C28, C29 = vip.C29, C30 =vip.C30, C31 =vip.C31, C32 = vip.C32;
		double D17 = vip.D17,D18 = vip.D18, D19 = vip.D19, D20 = vip.D20, D21 =vip.D21, D22 =vip.D22, D23 = vip.D23,  D26 = vip.D26, D27 =vip.D27, D28 = vip.D28, D29 = vip.D29, D30 =vip.D30, D32 = vip.D32,
				D48 = B8, D49 = B8, D50 = B8, D51 = B8, D52 = B8, D53 = B8, D54 = B8, D55 = B8, D56 = 0.045, D57 = 0.037, D72 = 0.037, D58 = B8, D59 = B8, D60 = B8, D61 = B8, D62 = B8, D63 = B8, D64 = B8, D65 = B8, D66 = B8, D67 = B8, D68 = B8, D69 = B8, D71 = B8, D70 = B8, D74 = B8, D75 = B8, D76 = B8;
		double F17 = vip.F17,F18 = vip.F18, F19 = vip.F19, F20 = vip.F20, F21 =vip.F21, F22 =vip.F22, F23 = vip.F23, F28 = vip.F28, F29 = vip.F29;
		double G17 = vip.G17,G18 = vip.G18, G19 = vip.G19, G20 = vip.G20, G21 =vip.G21, G22 =vip.G22, G23 = vip.G23, G28 = vip.G28, G29 = vip.G29;

		double E48 = (B5 - 2 * R5) * (C5 - S5) * pow6;
		double E49 = (C5 - S5) * X5 * pow6;
		double E50 = E49;
		double E51 = E48;
		double E52 = U5 * V5 * pow6;
		double E53 = (B5 - 2 * R5) * X5 * pow6 - E52;
		double E54 = AB5 * AC5 * pow6;
		double E55 = AB5 * AC5 * pow6;
		double E56 = Y5 * Z5 * pow6,

				E61 = E48,
				E62 = (C5 + E5 + K5 - AH5 - AF5) * (AL5 - L5 - O5) * pow6,
				E63 = (C5+ E5 + K5 - AH5 - AF5)	* (AL5 - L5 - O5) * pow6,
				E64 = (C5 + E5 + K5 - N5 - P5 - AH5)* (L5 + O5 - AG5) * pow6,
				E65 = (C5 + E5 + K5 - N5 - P5 - AH5)* (L5 + O5 - AG5) * pow6,
				E66 = (C5 + E5 + K5 - N5 - P5 - AH5)* (B5 - 2 * AE5) * pow6,
				E67 = AI5 * AJ5 * pow6, E68 = (B5 - 2 * AE5)* (N5 - AF5) * pow6,
				E69 = (B5 - 2 * AE5) * (L5 - AG5) * pow6,
				E70 = AM5* AN5 * pow6,
				E71 = AM5 * AN5 * pow6;

		vip.w1l = C5;                //  ld left up 62
		vip.h1l = AL5 - L5 + AG5 + AD5;

		vip.w1ldown = C5 - N5;       // ld left down  64
		vip.h1ldown = L5;

		vip.w1rdown = C5 - N5;// ld right down   65
		vip.h1rdown = L5;

		vip.w1r = C5;         // ld  right up    63
		vip.h1r = AL5 - L5 + AG5 + AD5;

		vip.w1ld = AN5 + 59; // ld left door ¿‰∂≥ “ 71
		vip.h1ld = AM5 + 38;

		vip.w1rd = AN5 + 59; // ld right door ¿‰∂≥ “  70
		vip.h1rd = AM5 + 38;

		vip.w1b = B5;// ld back  67
		vip.h1b = AL5 - L5 + AG5 + AD5;

		// ld bottom 66
		vip.w1bo = C5 - N5;
		vip.h1bo = B5;

		vip.h2l = X5 + Q5+AD5; // lc left 49
		vip.w2l = C5;

		vip.h2r = X5 + Q5+AD5; // lc right 50
		vip.w2r = C5;

		vip.h2ld =AB5 + 38 ; // lc left door 55
		vip.w2ld =AC5 + 59 ;

		vip.h2rd = AB5 + 38; // lc right door 54
		vip.w2rd = AC5 + 59 ;

		vip.h2t = C5; // lc top 48
		vip.w2t = B5 ;

		//  £”‡VIP√Êª˝–°”⁄¿‰≤ÿ±≥√Êµƒ∑Á’÷     52
		vip.h2bsmall = X5 + Q5; // lc back small
		vip.w2bsmall = B5;

		//  £”‡VIP√Êª˝¥Û”⁄¿‰≤ÿ±≥√Êµƒ∑Á’÷£ª  53
		vip.h2bbig = X5 + Q5; // lc back big 
		vip.w2bbig = B5;

		if(vip.SS_1==0){

			vip.H52=vip.thickness7;
			if(vip.F52>0 && vip.G52 >0){

				vip.a2bsmall = vip.F52;
				vip.b2bsmall = vip.G52;
//				System.out.println("vip.a2bsmall = vip.F52;	vip.b2bsmall = vip.G52;");
			}else{
				vip.a2bsmall =  U5 + 2 * (2 * vip.thickness7)*pow33;
				vip.b2bsmall =V5 + 2 * (2 * vip.thickness7)*pow33 ;
//				System.out.println("vip.a2bsmall =  U5 + 2 * (2 * vip.thickness7)*pow33;vip.b2bsmall =V5 + 2 * (2 * vip.thickness7)*pow33 ;");
			}
			vip.A2bsmall = (vip.w2bsmall - vip.a2bsmall) / 2;
			vip.B2bsmall = Q5 - (2 * vip.thickness7)*pow33;

			vip.S_1 = vip.a2bsmall * vip.b2bsmall; // lc ±≥≤ø£®’Ù∑¢∆˜£©

		}else if(vip.SS_1==1){
			vip.S_1 = 0; // lc ±≥≤ø£®’Ù∑¢∆˜£©
			vip.H52=0;
			vip.b2bsmall = 0;
			vip.a2bsmall = 0;
			vip.A2bsmall = 0;
			vip.B2bsmall = 0;
		};

		if(vip.SS_2==0){
			if(vip.F53>0 && vip.G53 >0){
				vip.a2bbig = vip.G53;
				vip.b2bbig = vip.F53;
			}else{
//			vip.a2bbig = B5 - 2 * R5 +  -U5 + U5 + 2 * (2 * vip.thickness7)*pow33 ;
				vip.a2bbig = B5 - 2 * R5 +  -U5  ;
				vip.b2bbig = X5  ;
			}

			vip.A2bbig = (vip.w2bbig - vip.a2bbig -vip.supply) / 2;
			vip.B2bbig = Q5 - (2 * vip.thickness7)*pow33;
//			System.out.println("vip.supply="+vip.supply);
			vip.S_2 = (vip.a2bbig+vip.supply) * vip.b2bbig - vip.a2bsmall * vip.b2bsmall; // ld ±≥≤ø£®’Ù∑¢∆˜£©

//			System.out.println("vip.a2bsmall="+vip.a2bsmall);
//			System.out.println("vip.b2bsmall="+vip.b2bsmall);
//			
//			System.out.println("vip.a2bbig="+vip.a2bbig);
//			System.out.println("vip.b2bbig="+vip.b2bbig);

//			System.out.println("vip.S_2="+vip.S_2);

			vip.H53=vip.thickness7;
		}else if(vip.SS_2==1){
			vip.S_2 = 0; // lc ±≥≤ø£®’Ù∑¢∆˜£©
			vip.H53=0;
			vip.b2bbig = 0;
			vip.a2bbig = 0;
			vip.A2bbig = 0;
			vip.B2bbig = 0;
		};

		if(vip.SS_3==0){
			vip.H67=vip.thickness3;
			if(vip.F67>0 && vip.G67 >0){
				vip.a1b = vip.F67;
				vip.b1b = vip.G67;
			}else{
				vip.a1b = AI5 + 2 * (2 * vip.thickness3)*pow33;
				vip.b1b = AJ5 + 2 * (2 * vip.thickness3)*pow33;
			}
			vip.A1b = (vip.w1b - vip.a1b) / 2;
			vip.B1b = AD5 - (2 * vip.thickness3)*pow33;

			vip.S_3 = vip.a1b * vip.b1b; // ld ±≥≤ø£®’Ù∑¢∆˜£©
		}else if(vip.SS_3==1){
			vip.S_3 = 0; // lc ±≥≤ø£®’Ù∑¢∆˜£©
			vip.H67=0;
			vip.a1b = 0;
			vip.b1b = 0;
			vip.A1b = 0;
			vip.B1b = 0;
		};

		if(vip.SS_4==0){
			vip.H62=vip.thickness1;
			if(vip.F62 >0 && vip.G62 >0){
				vip.a1l = vip.G62;
				vip.b1l = vip.F62;
			}else{
				vip.a1l = C5 + E5 + K5 - AH5 + 2 * (2 * vip.thickness1)*pow33 - AF5;
				vip.b1l = (AL5 - L5 - O5) + 2 * (2 * vip.thickness1)*pow33;
			}

			vip.A1l = AE5 - (2 * vip.thickness1)*pow33;
			vip.B1l = AD5 - (2 * vip.thickness1)*pow33;
			vip.S_4 = vip.a1l * vip.b1l; // ld◊Û≤‡ …œ
		}else if(vip.SS_4==1){
			vip.S_4 = 0; // lc ±≥≤ø£®’Ù∑¢∆˜£©
			vip.H62=0;

			vip.a1l = 0;
			vip.b1l = 0;
			vip.A1l = 0;
			vip.B1l = 0;
		};

		if(vip.SS_5==0){
			vip.H63=vip.thickness2;

			if(vip.F63 >0 && vip.G63 >0){

				vip.a1r = vip.G63;
				vip.b1r = vip.F63;
			}else{

				vip.a1r = C5 + E5 + K5 - AH5 + 2 * (2 * vip.thickness2)*pow33 - AF5;
				vip.b1r = (AL5 - L5 - O5) + 2 * (2 * vip.thickness2)*pow33;
			}

			vip.A1r = AE5 - (2 * vip.thickness2)*pow33;
			vip.B1r = AD5 - (2 * vip.thickness2)*pow33;

			vip.S_5 = vip.a1r * vip.b1r; // ld”“≤‡ …œ 
		}else if(vip.SS_5==1){
			vip.S_5 = 0; // lc ±≥≤ø£®’Ù∑¢∆˜£©
			vip.H63=0;

			vip.a1r = 0;
			vip.b1r = 0;
			vip.A1r = 0;
			vip.B1r = 0;
		};

		if(vip.SS_6==0){
			vip.H64=vip.thickness1;
			if(vip.F64 >0 && vip.G64 >0){
				vip.a1ldown = vip.G64 ;
				vip.b1ldown = vip.F64 ;
				System.out.println("64 111");
			}else if(  (vip.F64==0 && vip.G64 >0) || (vip.F64>0 && vip.G64 ==0) || (vip.F64==0 && vip.G64 ==0 && vip.G6400 *vip.G6400==0)){
				vip.a1ldown = 0;
				vip.b1ldown = 0;
				System.out.println("64 222");
			}else if(vip.F64==0 && vip.G64 ==0 && vip.G6400 *vip.G6400==1){
				vip.a1ldown = C5 + E5 + K5 - N5 - P5 - AH5 + (2 * vip.thickness1)*pow33;
				vip.b1ldown = (L5 + O5 - AG5) + 2 * (2 * vip.thickness1)*pow33;
				System.out.println("64 333");
			}

			vip.A1ldown = P5 - (2 * vip.thickness1)*pow33;
			vip.B1ldown = AD5 - (2 * vip.thickness1)*pow33;

			vip.S_6 = vip.a1ldown * vip.b1ldown;// ld◊Û≤‡ œ¬
		}else if(vip.SS_6==1){
			vip.S_6 = 0; // lc ±≥≤ø£®’Ù∑¢∆˜£©
			vip.H64=0;

			vip.a1ldown = 0;
			vip.b1ldown = 0;
			vip.A1ldown = 0;
			vip.B1ldown = 0;
		};

		if(vip.SS_7==0){
			vip.H65=vip.thickness2;
			if(vip.F65 >0 && vip.G65 >0){
				vip.a1rdown = vip.G65;
				vip.b1rdown = vip.F65;
				System.out.println("65 111");
			}else if( (vip.F65==0 && vip.G65 >0)|| (vip.F65>0 && vip.G65 ==0) || (vip.F65==0 && vip.G65 ==0 && vip.G6500 *vip.G6500==0)){
				vip.a1rdown = 0;
				vip.b1rdown = 0;
				System.out.println("65 222");
			}else if(vip.F65==0 && vip.G65 ==0 && vip.G6500 *vip.G6500==1){
				vip.a1rdown = C5 + E5 + K5 - N5 - P5 - AH5 + (2 * vip.thickness2)*pow33;
				vip.b1rdown = (L5 + O5 - AG5) + 2 * (2 * vip.thickness2)*pow33;
				System.out.println("65 333");
			}

			vip.A1rdown = P5 - (2 * vip.thickness2)*pow33;
			vip.B1rdown = AD5 - (2 * vip.thickness2)*pow33;
			vip.S_7 = vip.a1rdown * vip.b1rdown;// ld”“≤‡ œ¬
		}else if(vip.SS_7==1){
			vip.S_7 = 0;
			vip.H65=0;

			vip.a1rdown = 0;
			vip.b1rdown = 0;
			vip.A1rdown = 0;
			vip.B1rdown = 0;
		};

		if(vip.SS_8==0){
			vip.H49=vip.thickness5;
			if(vip.F49 >0 && vip.G49 >0){
				vip.b2l = vip.F49;
				vip.a2l = vip.G49;
			}else{
				vip.b2l = X5 + 2 * (2 * vip.thickness5)*pow33;
				vip.a2l = C5 - S5 + (2 * vip.thickness5)*pow33;
			}

			vip.A2l = S5 - (2 * vip.thickness5)*pow33;
			vip.B2l = Q5 - (2 * vip.thickness5)*pow33;
			vip.S_8 = vip.a2l * vip.b2l; // lc ◊Û≤‡
		}else if(vip.SS_8==1){
			vip.S_8 = 0; // lc ±≥≤ø£®’Ù∑¢∆˜£©
			vip.H49=0;

			vip.b2l = 0;
			vip.a2l = 0;
			vip.A2l = 0;
			vip.B2l = 0;
		};

		if(vip.SS_9==0){
			vip.H50=vip.thickness6;
			if(vip.F50 >0 && vip.G50 >0){
				vip.a2r = vip.G50;
				vip.b2r = vip.F50;
			}else{
				vip.b2r = X5 + 2*(2 * vip.thickness6)*pow33;
				vip.a2r = C5 - S5 + (2 * vip.thickness6)*pow33;
			}

			vip.A2r = S5 - (2 * vip.thickness6)*pow33;
			vip.B2r = Q5 - (2 * vip.thickness6)*pow33;

			vip.S_9 = vip.a2r * vip.b2r; // lc ”“≤‡
		}else if(vip.SS_9==1){
			vip.S_9 = 0; // lc ±≥≤ø£®’Ù∑¢∆˜£©
			vip.H50=0;

			vip.b2r = 0;
			vip.a2r = 0;
			vip.A2r = 0;
			vip.B2r = 0;
		};

		if(vip.SS_10==0){
			vip.H70=vip.thickness4;
			if(vip.F70 >0 && vip.G70 >0){
				vip.b1rd = vip.G70;
				vip.a1rd = vip.F70;
			}else{
				vip.b1rd = vip.AM5;
				vip.a1rd = vip.AN5;
			}

			vip.A1rd = (vip.w1rd - vip.a1rd) / 2;
			vip.B1rd = (vip.h1rd - vip.b1rd) / 2;
			vip.S_10 = vip.a1rd * vip.b1rd; // ld”“√≈
		}else if(vip.SS_10==1){
			vip.S_10 = 0; // lc ±≥≤ø£®’Ù∑¢∆˜£©
			vip.H70=0;

			vip.b1rd = 0;
			vip.a1rd = 0;
			vip.A1rd = 0;
			vip.B1rd = 0;
		};

		if(vip.SS_11==0){
			vip.H71=vip.thickness4;
			if(vip.F71 >0 && vip.G71 >0){
				vip.b1ld = vip.G71;
				vip.a1ld = vip.F71;
			}else{
				vip.b1ld = vip.AM5;
				vip.a1ld = vip.AN5;
			}

			vip.A1ld = (vip.w1ld - vip.a1ld) / 2;
			vip.B1ld = (vip.h1ld - vip.b1ld) / 2;
			vip.S_11 = vip.a1ld * vip.b1ld; // ld◊Û√≈
		}else if(vip.SS_11==1){
			vip.S_11 = 0; // lc ±≥≤ø£®’Ù∑¢∆˜£©
			vip.H71=0;
			vip.b1ld = 0;
			vip.a1ld = 0;
			vip.A1ld = 0;
			vip.B1ld = 0;
		};

		if(vip.SS_12==0){
			vip.H54=vip.thickness8;
			if(vip.F54 >0 && vip.G54 >0){
				vip.b2rd = vip.G54;
				vip.a2rd = vip.F54;
			}else{
				vip.b2rd = vip.AB5;
				vip.a2rd = vip.AC5;
			}

			vip.A2rd = (vip.w2rd - vip.a2rd) / 2;
			vip.B2rd = (vip.h2rd - vip.b2rd) / 2;
			vip.S_12 = vip.a2rd * vip.b2rd; // lc ”“√≈
		}else if(vip.SS_12==1){
			vip.S_12 = 0; // lc ±≥≤ø£®’Ù∑¢∆˜£©
			vip.H54=0;
			vip.b2rd = 0;
			vip.a2rd = 0;
			vip.A2rd = 0;
			vip.B2rd = 0;
		};

		if(vip.SS_13==0){
			vip.H55=vip.thickness8;
			if(vip.F55 >0 && vip.G55 >0){
				vip.b2ld = vip.G55;
				vip.a2ld = vip.F55;
			}else{
				vip.b2ld = vip.AB5;
				vip.a2ld = vip.AC5;
			}

			vip.A2ld = (vip.w2ld - vip.a2ld) / 2;
			vip.B2ld = (vip.h2ld - vip.b2ld) / 2;

			vip.S_13 = vip.a2ld * vip.b2ld; // lc ◊Û√≈
		}else if(vip.SS_13==1){
			vip.S_13 = 0; // lc ±≥≤ø£®’Ù∑¢∆˜£©
			vip.H55=0;
			vip.b2ld = 0;
			vip.a2ld = 0;
			vip.A2ld = 0;
			vip.B2ld = 0;
		};

		if(vip.SS_14==0){
			vip.H48=vip.thickness9;
			if(vip.F48 >0 && vip.G48 >0){
				vip.b2t = vip.G48;
				vip.a2t = vip.F48;
//				System.out.println("48 up");
			}else{
				vip.b2t = C5 - S5 + (2 * vip.thickness9)*pow33;
				vip.a2t = B5 - 2 * R5 + 2 * (2 * vip.thickness9)*pow33;
			}
			vip.A2t = R5 - vip.thickness9*pow33;
			vip.B2t = S5 - vip.thickness9*pow33;
			vip.S_14 = vip.a2t * vip.b2t; // lc ∂•≤ø
		}else if(vip.SS_14==1){
			vip.S_14 = 0; // lc ±≥≤ø£®’Ù∑¢∆˜£©
			vip.H48=0;
			vip.b2t = 0;
			vip.a2t = 0;
			vip.A2t = 0;
			vip.B2t = 0;
		};

		if(vip.SS_15==0){
			vip.H66=vip.thickness10;
			if(vip.F66 >0 && vip.G66 >0){
				vip.a1bo =vip.F66;
				vip.b1bo =vip.G66 ;
			}else{
				vip.a1bo = (C5 + E5 + K5 - N5 - P5 - AH5) + (2 * vip.thickness10)*pow33;
				vip.b1bo = (B5 - 2 * AE5) + 2 * (2 * vip.thickness10)*pow33;
//				System.out.println("66 down");
			}

			vip.A1bo = P5 - vip.thickness10*pow33;
			vip.B1bo = AE5 - vip.thickness10*pow33;
			vip.S_15 = vip.a1bo * vip.b1bo; // ld µ◊≤ø
		}else if(vip.SS_15==1){
			vip.S_15 = 0; // lc ±≥≤ø£®’Ù∑¢∆˜£©
			vip.H66=0;
			vip.a1bo = 0;
			vip.b1bo = 0;
			vip.A1bo = 0;
			vip.B1bo = 0;
		};

		double aa = vip.viparea;
		double s1 = vip.S_1;
		double s2 = vip.S_2;
		double s3 = vip.S_3;
		double s4 = vip.S_4;
		double s5 = vip.S_5;
		double s6 = vip.S_6;
		double s7 = vip.S_7;
		double s8 = vip.S_8;
		double s9 = vip.S_9;
		double s10 = vip.S_10;
		double s11 = vip.S_11;
		double s12 = vip.S_12;
		double s13 = vip.S_13;
		double s14 = vip.S_14;
		double s15 = vip.S_15;

//		 System.out.println("s1="+s1);
//		 System.out.println("s2="+s2);
//		 System.out.println("s3="+s3);
//		 System.out.println("s4="+s4);
//		 System.out.println("s5="+s5);
//		 System.out.println("s6="+s6);
//		 System.out.println("s7="+s7);
//		 System.out.println("s8="+s8);
//		 System.out.println("s9="+s9);
//		 System.out.println("s10="+s10);
//		 System.out.println("s11="+s11);
//		 System.out.println("s12="+s12);
//		 System.out.println("s13="+s13);
//		 System.out.println("s14="+s14);
//		 System.out.println("s15="+s15);
//		 vip.areaTuiJian=pow6*(s1+s2+s3+s4+s5+s6+s7+s8+s9+s10+s11+s12+s13+s14+s15);

		if (aa <= 0) {
			vip.H52=0;
			vip.H53=0;
			vip.H67=0;
			vip.H62=0;
			vip.H63=0;
			vip.H64=0;
			vip.H65=0;
			vip.H49=0;
			vip.H50=0;
			vip.H70=0;
			vip.H71=0;
			vip.H54=0;
			vip.H55=0;
			vip.H66=0;
			vip.H48=0;
			System.out.println("aa < =0");
		} else if(aa>0 && aa<s1){
			vip.H52=vip.thickness7;
			vip.H53=0;
			vip.H67=0;
			vip.H62=0;
			vip.H63=0;
			vip.H64=0;
			vip.H65=0;
			vip.H49=0;
			vip.H50=0;
			vip.H70=0;
			vip.H71=0;
			vip.H54=0;
			vip.H55=0;
			vip.H66=0;
			vip.H48=0;
			System.out.println("0 < aa < s1");
		}
		else if (aa >= s1 && aa <  (s1 + s2)) {//—≠ª∑µƒ ±∫Ú ≤ªƒ‹±»s1–°£°£°£°£°£°£°£°£°£°£°£°£°£°
			vip.H53=vip.thickness7;
			vip.H67=0;
			vip.H62=0;
			vip.H63=0;
			vip.H64=0;
			vip.H65=0;
			vip.H49=0;
			vip.H50=0;
			vip.H70=0;
			vip.H71=0;
			vip.H54=0;
			vip.H55=0;
			vip.H66=0;
			vip.H48=0;
			System.out.println("aa >= s1");
		} else if (aa >= (s1 + s2) && aa < (s1 + s2 + s3)) {
			vip.H67=vip.thickness;
			vip.H62=0;
			vip.H63=0;
			vip.H64=0;
			vip.H65=0;
			vip.H49=0;
			vip.H50=0;
			vip.H70=0;
			vip.H71=0;
			vip.H54=0;
			vip.H55=0;
			vip.H66=0;
			vip.H48=0;
			System.out.println("aa >= s2");
			// lc left
		} else if (aa >= (s1 + s2 + s3) && aa < (s1 + s2 + s3 + s4)) {
			vip.H62=vip.thickness1;
			vip.H63=0;
			vip.H64=0;
			vip.H65=0;
			vip.H49=0;
			vip.H50=0;
			vip.H70=0;
			vip.H71=0;
			vip.H54=0;
			vip.H55=0;
			vip.H66=0;
			vip.H48=0;
			System.out.println("aa >= s3");

		} else if (aa >= (s1 + s2 + s3 + s4) && aa < (s1 + s2 + s3 + s4 + s5)) {
			vip.H63=vip.thickness2;
			vip.H64=0;
			vip.H65=0;
			vip.H49=0;
			vip.H50=0;
			vip.H70=0;
			vip.H71=0;
			vip.H54=0;
			vip.H55=0;
			vip.H66=0;
			vip.H48=0;
			System.out.println("aa >= s4");
		} else if (aa >= (s1 + s2 + s3 + s4 + s5)  && aa < (s1 + s2 + s3 + s4 + s5 + s6)) {
			vip.H64=vip.thickness1;
			vip.H65=0;
			vip.H49=0;
			vip.H50=0;
			vip.H70=0;
			vip.H71=0;
			vip.H54=0;
			vip.H55=0;
			vip.H66=0;
			vip.H48=0;
			System.out.println("aa >= s5");
		}else if (aa >= (s1 + s2 + s3 + s4 + s5+ s6)  && aa < (s1 + s2 + s3 + s4 + s5 + s6+ s7)) {
			vip.H65=vip.thickness2;
			vip.H49=0;
			vip.H50=0;
			vip.H70=0;
			vip.H71=0;
			vip.H54=0;
			vip.H55=0;
			vip.H66=0;
			vip.H48=0;
			System.out.println("aa >= s6");
		}
		else if (aa >= (s1 + s2 + s3 + s4 + s5+ s6 + s7)  && aa < (s1 + s2 + s3 + s4 + s5 + s6+ s7 + s8)) {
			vip.H49=vip.thickness5;
			vip.H50=0;
			vip.H70=0;
			vip.H71=0;
			vip.H54=0;
			vip.H55=0;
			vip.H66=0;
			vip.H48=0;
			System.out.println("aa >= s7");
		}
		else if (aa >= (s1 + s2 + s3 + s4 + s5+ s6 + s7 + s8)  && aa < (s1 + s2 + s3 + s4 + s5 + s6+ s7+ s8 + s9)) {
			vip.H50=vip.thickness6;
			vip.H70=0;
			vip.H71=0;
			vip.H54=0;
			vip.H55=0;
			vip.H66=0;
			vip.H48=0;
			System.out.println("aa >= s8");
		}else if (aa >= (s1 + s2 + s3 + s4 + s5+ s6 + s7+ s8 + s9)  && aa < (s1 + s2 + s3 + s4 + s5 + s6+ s7 +s8 + s9 +s10)) {
			vip.H70=vip.thickness4;
			vip.H71=0;
			vip.H54=0;
			vip.H55=0;
			vip.H66=0;
			vip.H48=0;
			System.out.println("aa >= s9");
		}else if (aa >= (s1 + s2 + s3 + s4 + s5+ s6 + s7 +s8 + s9 +s10)  && aa < (s1 + s2 + s3 + s4 + s5 + s6+ s7  +s8 + s9 +s10 +s11)) {
			vip.H71=vip.thickness4;
			vip.H54=0;
			vip.H55=0;
			vip.H66=0;
			vip.H48=0;
			System.out.println("aa >= s10");
		}else if (aa >= (s1 + s2 + s3 + s4 + s5+ s6 + s7  +s8 + s9 +s10 +s11)  && aa < (s1 + s2 + s3 + s4 + s5 + s6+ s7 +s8 + s9 +s10 +s11 +12)) {
			vip.H54=vip.thickness8;
			vip.H55=0;
			vip.H66=0;
			vip.H48=0;
			System.out.println("aa >= s11");
		}else if (aa >= (s1 + s2 + s3 + s4 + s5+ s6 + s7  +s8 + s9 +s10 +s11 +s12)  && aa < (s1 + s2 + s3 + s4 + s5 + s6+ s7 +s8 + s9 +s10 +s11 +s12 +s13)) {
			vip.H55=vip.thickness8;
			vip.H48=0;
			vip.H66=0;
			System.out.println("aa >= s12");
		}else if (aa >= (s1 + s2 + s3 + s4 + s5+ s6 + s7  +s8 + s9 +s10 +s11 +s12 +s13)  && aa < (s1 + s2 + s3 + s4 + s5 + s6+ s7 +s8 + s9 +s10 +s11 +12 +s13 +s14)) {

			vip.H48=vip.thickness9;
			vip.H66=0;
			System.out.println("aa >= s13");
		}else if (aa >= (s1 + s2 + s3 + s4 + s5+ s6 + s7  +s8 + s9 +s10 +s11 +s12 +s13 +s14)  && aa < (s1 + s2 + s3 + s4 + s5 + s6+ s7 +s8 + s9 +s10 +s11 +s12 +s13 +s14  +s15 )) {
			vip.H66=vip.thickness10;
			System.out.println("aa >= s14");
		}else if (aa >= (s1 + s2 + s3 + s4 + s5+ s6 + s7 +s8 + s9 +s10 +s11 +s12 +s13 +s14 +s15)) {
			if(vip.H52>0){vip.H52=vip.thickness7;}else{vip.H52=0;}
			if(vip.H53>0){vip.H53=vip.thickness7;}else{vip.H53=0;}
			if(vip.H67>0){vip.H67=vip.thickness3;}else{vip.H67=0;}
			if(vip.H62>0){vip.H62=vip.thickness1;}else{vip.H62=0;}
			if(vip.H63>0){vip.H63=vip.thickness2;}else{vip.H63=0;}
			if(vip.H64>0){vip.H64=vip.thickness1;}else{vip.H64=0;}
			if(vip.H65>0){vip.H65=vip.thickness2;}else{vip.H65=0;}
			if(vip.H49>0){vip.H49=vip.thickness5;}else{vip.H49=0;}
			if(vip.H50>0){vip.H50=vip.thickness6;}else{vip.H50=0;}
			if(vip.H70>0){vip.H70=vip.thickness4;}else{vip.H70=0;}
			if(vip.H71>0){vip.H71=vip.thickness4;}else{vip.H71=0;}
			if(vip.H54>0){vip.H54=vip.thickness8;}else{vip.H54=0;}
			if(vip.H55>0){vip.H55=vip.thickness8;}else{vip.H55=0;}
			if(vip.H48>0){vip.H48=vip.thickness9;}else{vip.H48=0;}
			if(vip.H66>0){vip.H66=vip.thickness10;}else{vip.H66=0;}
			System.out.println("aa >= s15");
		}

		double H52 = vip.H52, H67 = vip.H67, H62 = vip.H62, H63 = vip.H63, H64 = vip.H64, H65 = vip.H65, H49 = vip.H49, H50 = vip.H50, H70 = vip.H70, H71 = vip.H71, H53 = vip.H53, H54 = vip.H54, H55 = vip.H55, H48 = vip.H48, H66 = vip.H66,
				I48 = 0, I49 = 0, I50 = 0, I52 = 0, I53 = 0, I54 = 0, I55 = 0, I62 = 0, I63 = 0, I64 = 0, I65 = 0, I66 = 0, I67 = 0, I70 = 0, I71 = 0;

		double F48 = B5 - 2 * R5 + 2 * (2 * H48)*pow33,
				G48 = (C5 - S5) + (2 * H48)*pow33,

				F49 = X5 + 2 * 2 * H49*pow33,
				G49 = (C5 - S5) + (2 * H49)*pow33,

				F50 = X5 + 2 * 2 * H50*pow33,
				G50 = (C5 - S5) +  (2 * H50)*pow33,

				F51 = 0,
				G51 = 0,

				F52 = U5	+ 2*2 * H52*pow33,
				G52 = V5 + 2 * 2 * H52*pow33,

//			   F53 = X5 + 2 * 2 * H53*pow33, 
//			   G53 = B5 - U5 - 2 * R5+ 2 * 2 * H53*pow33, 

				F53 = X5 ,
//					   G53 = B5 - U5 - 2 * R5+ U5 + 2 * (2 * H53)*pow33 , 
				G53 = B5 - U5 - 2 * R5,

				F54 = AC5,
				G54 = AB5,

				F55 = AC5,
				G55 = AB5,

				F61 = 0, G61 = 0,

				F62 = (AL5 - L5 - O5) + 2 * 2 * H62*pow33,
				G62 = C5 + E5+ K5 - AH5 - AF5 + 2 * 2 * H62*pow33,

				F63 = (AL5 - L5 - O5) + 2 * 2* H63*pow33,
				G63 = C5 + E5 + K5 - AH5 - AF5 + 2 * 2 * H63*pow33,

				F64 = (L5+ O5 - AG5)	+ 2 * 2 * H64*pow33,
				G64 = C5 + E5 + K5 - N5 - P5 - AH5 +  2 * H64*pow33,

				F65 = (L5+ O5 - AG5)	+ 2 * 2 * H65*pow33,
				G65 = C5 + E5 + K5 - N5 - P5 - AH5 + 2 * H65*pow33,

				F66 = (C5+ E5 + K5 - N5 - P5 - AH5)	+  (2 * H66)*pow33,
				G66 = (B5 - 2 * AE5) + 2 * (2 * H66)*pow33,

				F67 = AI5+ 2 * (2 * H67)*pow33,
				G67 = AJ5 + 2 * (2 * H67)*pow33,

				F68 = 0, G68 = 0,
				F69 = 0, G69 = 0,

				F70 = AN5,
				G70 = AM5,

				F71 = AN5,
				G71 = AM5;

		if(H48==0 && vip.newvip==0){vip.F48=0;vip.G48=0;} else if(H48>0 && vip.newvip==0){vip.G48=G48;vip.F48=F48;}else if(vip.F48>0 && vip.G48>0 && vip.newvip==1){G48=vip.G48; F48=vip.F48;}

		if(H49==0 && vip.newvip==0){vip.F49=0;vip.G49=0;} else if(H49>0 && vip.newvip==0){vip.G49=G49;vip.F49=F49;}else if(vip.F49>0 && vip.G49>0 && vip.newvip==1){G49=vip.G49; F49=vip.F49;}

		if(H50==0 && vip.newvip==0){vip.F50=0;vip.G50=0;} else if(H50>0 && vip.newvip==0){vip.G50=G50;vip.F50=F50;}else if(vip.F50>0 && vip.G50>0 && vip.newvip==1){G50=vip.G50; F50=vip.F50;}

		if(H52==0 && vip.newvip==0){vip.F52=0;vip.G52=0;} else if(H52>0 && vip.newvip==0){vip.G52=G52;vip.F52=F52;}else if(vip.F52>0 && vip.G52>0 && vip.newvip==1){G52=vip.G52; F52=vip.F52;}

		if(H53==0 && vip.newvip==0){vip.F53=0;vip.G53=0;} else if(H53>0 && vip.newvip==0){vip.G53=G53;vip.F53=F53;}else if(vip.F53>0 && vip.G53>0 && vip.newvip==1){G53=vip.G53; F53=vip.F53;}

		if(H54==0 && vip.newvip==0){vip.F54=0;vip.G54=0;} else if(H54>0 && vip.newvip==0){vip.G54=G54;vip.F54=F54;}else if(vip.F54>0 && vip.G54>0 && vip.newvip==1){G54=vip.G54; F54=vip.F54;}

		if(H55==0 && vip.newvip==0){vip.F55=0;vip.G55=0;} else if(H55>0 && vip.newvip==0){vip.G55=G55;vip.F55=F55;}else if(vip.F55>0 && vip.G55>0 && vip.newvip==1){G55=vip.G55; F55=vip.F55;}

		if(H62==0 && vip.newvip==0){vip.F62=0;vip.G62=0;} else if(H62>0 && vip.newvip==0){vip.G62=G62;vip.F62=F62;}else if(vip.F62>0 && vip.G62>0 && vip.newvip==1){G62=vip.G62; F62=vip.F62;}

		if(H63==0 && vip.newvip==0){vip.F63=0;vip.G63=0;} else if(H63>0 && vip.newvip==0){vip.G63=G63;vip.F63=F63;}else if(vip.F63>0 && vip.G63>0 && vip.newvip==1){G63=vip.G63; F63=vip.F63;}

		if(H64==0 && vip.newvip==0){vip.F64=0;vip.G64=0;} else if(H64>0 && vip.newvip==0){vip.G64=G64;vip.F64=F64;}else if(vip.F64>0 && vip.G64>0 && vip.newvip==1){G64=vip.G64; F64=vip.F64;} else if(vip.F64 * vip.G64 == 0 && vip.newvip==1){H64=0;G64=vip.G64; F64=vip.F64; System.out.println("vip.F64 * vip.G64 == 0");}//ld down */

		if(H65==0 && vip.newvip==0){vip.F65=0;vip.G65=0;} else if(H65>0 && vip.newvip==0){vip.G65=G65;vip.F65=F65;}else if(vip.F65>0 && vip.G65>0 && vip.newvip==1){G65=vip.G65; F65=vip.F65;} else if(vip.F65 * vip.G65 == 0 && vip.newvip==1){H65=0;G65=vip.G65; F65=vip.F65; System.out.println("vip.F65 * vip.G65 == 0");}//ld down  */

		if(H66==0 && vip.newvip==0){vip.F66=0;vip.G66=0;} else if(H66>0 && vip.newvip==0){vip.G66=G66;vip.F66=F66;}else if(vip.F66>0 && vip.G66>0 && vip.newvip==1){G66=vip.G66; F66=vip.F66;}

		if(H67==0 && vip.newvip==0){vip.F67=0;vip.G67=0;} else if(H67>0 && vip.newvip==0){vip.G67=G67;vip.F67=F67;}else if(vip.F67>0 && vip.G67>0 && vip.newvip==1){G67=vip.G67; F67=vip.F67;}

		if(H70==0 && vip.newvip==0){vip.F70=0;vip.G70=0;} else if(H70>0 && vip.newvip==0){vip.G70=G70;vip.F70=F70;}else if(vip.F70>0 && vip.G70>0 && vip.newvip==1){G70=vip.G70; F70=vip.F70;}

		if(H71==0 && vip.newvip==0){vip.F71=0;vip.G71=0;} else if(H70>0 && vip.newvip==0){vip.G71=G71;vip.F71=F71;}else if(vip.F71>0 && vip.G71>0 && vip.newvip==1){G71=vip.G71; F71=vip.F71;}

		if (H48 > 0) {
			I48 = (B9 / H48 + (2 * (F48 + G48) * pow3 * (B11 * B12))/ (F48 * G48 * pow6 * (H48 + 0.516 * Math.sqrt(B11 * B12))))* H48;
		}

		if (H49 > 0) {
			I49 = (B9 / H49 + (2 * (F49 + G49) * pow3 * (B11 * B12))
					/ (F49 * G49 * pow6 * (H49 + 0.516 * Math.sqrt(B11 * B12))))
					* H49;
		}

		if (H50 > 0) {
			I50 = (B9 / H50 + (2 * (F50 + G50) * pow3 * (B11 * B12))
					/ (F50 * G50 * pow6 * (H50 + 0.516 * Math.sqrt(B11 * B12))))
					* H50;
		}

		if (H52 > 0) {
			I52 = (B9 / H52 + (2 * (F52 + G52) * pow3 * (B11 * B12))
					/ (F52 * G52 * pow6 * (H52 + 0.516 * Math.sqrt(B11 * B12))))
					* H52;
		}

		if (H53 > 0) {
			I53 = (B9 / H53 + (2 * (F53 + G53) * pow3 * (B11 * B12))
					/ (F53 * G53 * pow6 * (H53 + 0.516 * Math.sqrt(B11 * B12))))
					* H53;
		}

		if (H54 > 0) {
			I54 = (B9 / H54 + (2 * (F54 + G54) * pow3 * (B11 * B12))
					/ (F54 * G54 * pow6 * (H54 + 0.516 * Math.sqrt(B11 * B12))))
					* H54;
		}

		if (H55 > 0) {
			I55 = (B9 / H55 + (2 * (F55 + G55) * pow3 * (B11 * B12))
					/ (F55 * G55 * pow6 * (H55 + 0.516 * Math.sqrt(B11 * B12))))
					* H55;
		}

		if (H62 > 0) {
			I62 = (B9 / H62 + (2 * (F62 + G62) * pow3 * (B11 * B12))/ (F62 * G62 * pow6 * (H62 + 0.516 * Math.sqrt(B11 * B12))))* H62;
		}

		if (H63 > 0) {
			I63 = (B9 / H63 + (2 * (F63 + G63) * pow3 * (B11 * B12))
					/ (F63 * G63 * pow6 * (H63 + 0.516 * Math.sqrt(B11 * B12))))
					* H63;
		}

		if (H64 > 0) {
			I64 = (B9 / H64 + (2 * (F64 + G64) * pow3 * (B11 * B12))
					/ (F64 * G64 * pow6 * (H64 + 0.516 * Math.sqrt(B11 * B12))))
					* H64;
		}

		if (H65 > 0) {
			I65 = (B9 / H65 + (2 * (F65 + G65) * pow3 * (B11 * B12))
					/ (F65 * G65 * pow6 * (H65 + 0.516 * Math.sqrt(B11 * B12))))
					* H65;
		}

		if (H66 > 0) {
			I66 = (B9 / H66 + (2 * (F66 + G66) * pow3 * (B11 * B12))
					/ (F66 * G66 * pow6 * (H66 + 0.516 * Math.sqrt(B11 * B12))))
					* H66;
		}

		if (H67 > 0) {
			I67 = (B9 / H67 + (2 * (F67 + G67) * pow3 * (B11 * B12))
					/ (F67 * G67 * pow6 * (H67 + 0.516 * Math.sqrt(B11 * B12))))
					* H67;
		}

		if (H70 > 0) {
			I70 = (B9 / H70 + (2 * (F70 + G70) * pow3 * (B11 * B12))
					/ (F70 * G70 * pow6 * (H70 + 0.516 * Math.sqrt(B11 * B12))))
					* H70;
		}

		if (H71 > 0) {
			I71 = (B9 / H71 + (2 * (F71 + G71) * pow3 * (B11 * B12))
					/ (F71 * G71 * pow6 * (H71 + 0.516 * Math.sqrt(B11 * B12))))
					* H71;
		}

		double  J48 = 0.86, K48 = Q5 / 1000, J49 = 0.86, K49 = R5 / 1000, J50 = 0.86, K50 = K49, J51 = 0.86, K51 = AD5 / 1000, J52 = 0.86, K52 = ((S5 - W5) - 2) / 1000, J53 = 0.86, K53 = S5 / 1000, J54 = 0.86, K54 = T5 / 1000, J55 = 0.86, K55 = T5 / 1000, K56 = 0.02;

		double O46 = 16,//16
				L46 = 32,//32
				R46 = 38,//38
				U46 = 43,//43
				L48 = L46 - C18,
				L49 = C22 - C18,
				L50 = C22 - C18,
				L51 = C19 - C18 - 2,
				L52 = L46 - C23,
				L53 = L46 - C18,
				L54 = L46 - C18,
				L55 = L46 - C18,
				L56 = L46 - C18,
				L57 = L46 - C18,
				L58 = L46 - C18,
				L59 = L46 - C18,
				L60 = L46 - C18,
				L61 = -L51,
				L62 = C22 - C19,
				L63 = C22 - C19,
				L64 = C22 - C19,
				L65 = C22 - C19,
				L66 = L46 - C19,
				L67 = L46 - C21,
				L68 = C20 - C19,
				L69 = C20 - C19,
				L70 = L46 - C19,
				L71 = L46 - C19,
				L72 = C22 - C19,
				L73 = 0,
				L74 = L46 - C19,
				L75 = L46 - C19,
				L76 = L46 - C19;
		if(vip.type=="BCD-639W" || vip.type=="BCD-505W" ){
			L49= C17 - C18;
			L50= C17 - C18;
			L62= C17 - C19;
			L63= C17 - C19;
			L64= C17 - C19;
			L65= C17 - C19;
		}
		double J61 = 0.86, J62 = 0.86, J63 = 0.86, J64 = 0.86, J65 = 0.86, J66 = 0.86, J67 = 0.86, J68 = 0.86, J69 = 0.86, J70 = 0.86,J71 = 0.86, J72 = 0.86;
		double K61 = K51, K62 = AE5 / 1000, K63 = K62, K64 = K63, K65 = K64, K66 = AG5 / 1000, K67 = AF5 / 1000, K68 = O5 / 1000, K69 = P5 / 1000, K70 = AH5 / 1000, K71 = AH5 / 1000;

		double M48 = L48 * E48 / (1. / 10 + 1. / 5 + K48 / (C8 * D48));
		double M49 = L49 * E49 / (1. / 10 + 1. / 5 + K49 / (C8 * D49));
		double M50 = L50 * E50 / (1. / 10 + 1. / 5 + K50 / (C8 * D50));
		double M51 = L51 * E51 / (1. / 10 + 1. / 10 + K51 / (C8 * D51));
		double M52 = L52 * E52 / (1. / 10 + 1. / 5 + K52 / (C8 * D52));
		double M53 = L53 * E53 / (1. / 10 + 1. / 5 + K53 / (C8 * D53));
		double M54 = L54 * E54 / (1. / 10 + 1. / 5 + K54 / (C8 * D54));
		double M55 = L55 * E55 / (1. / 10 + 1. / 5 + K55 / (C8 * D55));
		double M56 = L56 * E56 / (1. / 10 + 1. / 5 + K56 / (C8 * D56));

		double M57 = 4 * (AB5 + AC5) * D57 * L57 * pow3;
		double M58 = 2 * 0.54 * X5 * D58 * C8 * L58 * pow3;
		double M59 = 2 * 0.54 * C5 * D59 * C8 * L59 * pow3;
		double M60 = 0.54 * B5 * D60 * C8 * L60 * pow3;
		double M61 = L61 * E61 / (1. / 10 + 1. / 10 + K61 / (C8 * D61));
		double M62 = L62 * E62 / (1. / 10 + 1. / 5 + K62 / (C8 * D62));
		double M63 = L63 * E63 / (1. / 10 + 1. / 5 + K63 / (C8 * D63));
		double M64 = L64 * E64 / (1. / 10 + 1. / 5 + K64 / (C8 * D64));
		double M65 = L65 * E65 / (1. / 10 + 1. / 5 + K65 / (C8 * D65));
		double M66 = L66 * E66 / (1. / 10 + 1. / 5 + K66 / (C8 * D66));
		double M67 = L67 * E67 / (1. / 10 + 1. / 5 + K67 / (C8 * D67));
		double M68 = L68 * E68 / (1. / 10 + 1. / 5 + K68 / (C8 * D68));
		double M69 = L69 * E69 / (1. / 10 + 1. / 5 + K69 / (C8 * D69));
		double M70 = L70 * E70 / (1. / 10 + 1. / 5 + K70 / (C8 * D70));
		double M71 = L71 * E71 / (1. / 10 + 1. / 5 + K71 / (C8 * D71));

		double M72 = 4 * (AM5 + AN5) * D72 * L72 * pow3;
		double M73 = C28 * C29 * (1 - C30);
		double M74 = 2 * 0.54 * (AL5 - L5 - O5) * D74 * C8 * L74 * pow3;
		double M75 = 2 * 0.54 * (B5 - 2 * AE5) * D75 * C8 * L75 * pow3;
		double M76 = 2 * 0.54 * C5 * D76 * C8 * L76 * pow3;

		double N48 = 1, N49 = 1, N50 = 1, N52 = 1, N53 = 1, N54 = 1, N55 = 1, N62 = 1, N63 = 1, N64 = 1, N65 = 1, N66 = 1, N67 = 1, N70 = 1, N71 = 1, Q48 = 1, Q49 = 1, Q50 = 1, Q52 = 1, Q53 = 1, Q54 = 1, Q55 = 1, Q62 = 1, Q63 = 1, Q64 = 1, Q65 = 1, Q66 = 1, Q67 = 1, Q70 = 1, Q71 = 1;
		double T48 = 1, T49 = 1, T50 = 1, T52 = 1, T53 = 1, T54 = 1, T55 = 1, T62 = 1, T63 = 1, T64 = 1, T65 = 1, T66 = 1, T67 = 1, T70 = 1, T71 = 1, W48 = 1, W49 = 1, W50 = 1, W52 = 1, W53 = 1, W54 = 1, W55 = 1, W62 = 1, W63 = 1, W64 = 1, W65 = 1, W66 = 1, W67 = 1, W70 = 1, W71 = 1;

		double  N51 = M51,
				N56 = M56,
				N57 = M57,
				N58 = M58,
				N59 = M59,
				N60 = M60,
				N61 = -N51,
				N68 = M68,
				N69 = M69,
				N72 = M72,
				N73 = M73,
				N74 = M74,
				N75 = M75,
				N76 = M76;


		double O48 = O46 - D18;
		double O49 = D22 - D18;
		double O50 = D22 - D18;
		double O51 = D19 - D18 - 2;
		double O52 = O46 - D23;
		double O53 = O46 - D18;
		double O54 = O46 - D18;
		double O55 = O46 - D18;
		double O56 = O46 - D18;
		double O57 = O46 - D18;
		double O58 = O46 - D18;
		double O59 = O46 - D18;
		double O60 = O46 - D18;
		double O61 = -O51;
		double O62 = D22 - D19;
		double O63 = D22 - D19;
		double O64 = D22 - D19;
		double O65 = D22 - D19;
		double O66 = O46 - D19;
		double O67 = O46 - D21;
		double O68 = D20 - D19;
		double O69 = D20 - D19;
		double O70 = O46 - D19;
		double O71 = O46 - D19;
		double O72 = D22 - D19;
		double O74 = O46 - D19;
		double O75 = O46 - D19;
		double O76 = O46 - D19;
		if(vip.type=="BCD-639W" || vip.type=="BCD-505W"){
			O49= D17-D18;
			O50= D17-D18;
			O62= D17-D19;
			O63= D17-D19;
			O64= D17-D19;
			O65= D17-D19;
		}

		double R48 = R46 - F18;
		double R49 = F22 - F18;
		double R50 = F22 - F18;
		double R51 = F19 - F18 - 2;
		double R52 = R46 - F23;
		double R53 = R46 - F18;
		double R54 = R46 - F18;
		double R55 = R46 - F18;
		double R56 = R46 - F18;
		double R57 = R46 - F18;
		double R58 = R46 - F18;
		double R59 = R46 - F18;
		double R60 = R46 - F18;
		double R61 = -R51;
		double R62 = F22 - F19;
		double R63 = F22 - F19;
		double R64 = F22 - F19;
		double R65 = F22 - F19;
		double R66 = R46 - F19;
		double R67 = R46 - F21;
		double R68 = F20 - F19;
		double R69 = F20 - F19;
		double R70 = R46 - F19;
		double R71 = R46 - F19;
		double R72 = F22 - F19;
		double R74 = R46 - F19;
		double R75 = R46 - F19;
		double R76 = R46 - F19;

		double U48 = U46 - G18;
		double U49 = G22 - G18;
		double U50 = G22 - G18;
		double U51 = G19 - G18 - 2;
		double U52 = U46 - G23;
		double U53 = U46 - G18;
		double U54 = U46 - G18;
		double U55 = U46 - G18;
		double U56 = U46 - G18;
		double U57 = U46 - G18;
		double U58 = U46 - G18;
		double U59 = U46 - G18;
		double U60 = U46 - G18;
		double U61 = -U51;
		double U62 = G22 - G19;
		double U63 = G22 - G19;
		double U64 = G22 - G19;
		double U65 = G22 - G19;
		double U66 = U46 - G19;
		double U67 = U46 - G21;
		double U68 = G20 - G19;
		double U69 = G20 - G19;
		double U70 = U46 - G19;
		double U71 = U46 - G19;
		double U72 = G22 - G19;
		double U73 = C28*(1-C30);
		double U74 = U46 - G19;
		double U75 = U46 - G19;
		double U76 = U46 - G19;



		double P48 = O48 * E48 / (1. / 10 + 1. / 5 + K48 / (D48));
		double P49 = O49 * E49 / (1. / 10 + 1. / 5 + K49 / (D49));
		double P50 = O50 * E50 / (1. / 10 + 1. / 5 + K50 / (D50));
		double P51 = O51 * E51 / (1. / 10 + 1. / 10 + K51 / (D51));
		double P52 = O52 * E52 / (1. / 10 + 1. / 5 + K52 / (D52));
		double P53 = O53 * E53 / (1. / 10 + 1. / 5 + K53 / (D53));
		double P54 = O54 * E54 / (1. / 10 + 1. / 5 + K54 / (D54));
		double P55 = O55 * E55 / (1. / 10 + 1. / 5 + K55 / (D55));
		double P56 = O56 * E56 / (1. / 10 + 1. / 5 + K56 / (D56));
		double P57 = 4 * (AB5 + AC5) * D57 * O57 * pow3;
		double P58 = 2 * 0.54 * X5 * D58 * O58 * pow3;
		double P59 = 2 * 0.54 * C5 * D59 * O59 * pow3;
		double P60 = 0.54 * B5 * D60 * O60 * pow3;
		double P61 = -P51;
		double P62 = O62 * E62 / (1. / 10 + 1. / 5 + K62 / (D62));
		double P63 = O63 * E63 / (1. / 10 + 1. / 5 + K63 / (D63));
		double P64 = O64 * E64 / (1. / 10 + 1. / 5 + K64 / (D64));
		double P65 = O65 * E65 / (1. / 10 + 1. / 5 + K65 / (D65));
		double P66 = O66 * E66 / (1. / 10 + 1. / 5 + K66 / (D66));
		double P67 = O67 * E67 / (1. / 10 + 1. / 5 + K67 / (D67));
		double P68 = O68 * E68 / (1. / 10 + 1. / 5 + K68 / (D68));
		double P69 = O69 * E69 / (1. / 10 + 1. / 5 + K69 / (D69));
		double P70 = O70 * E70 / (1. / 10 + 1. / 5 + K70 / (D70));
		double P71 = O71 * E71 / (1. / 10 + 1. / 5 + K71 / (D71));
		double P72 = 4 * (AM5 + AN5) * D72 * O72 * pow3;
		double P73 = D28 * D29 * (1 - D30);
		double P74 = 2 * 0.54 * (AL5 - L5 - O5) * D74 * O74 * pow3;
		double P75 = 2 * 0.54 * (B5 - 2 * AE5) * D75 * O75 * pow3;
		double P76 = 2 * 0.54 * C5 * D76 * O76 * pow3;
		double Q51 = P51;
		double Q56 = P56;
		double Q57 = P57;
		double Q58 = P58;
		double Q59 = P59;
		double Q60 = P60;
		double Q61 = -Q51;

		double Q68 = P68;
		double Q69 = P69;
		double Q72 = P72;
		double Q73 = P73;
		double Q74 = P74;
		double Q75 = P75;
		double Q76 = P76;
		double S48 = R48*E48/(1./10+1./5+K48/(E8*D48));
		double S49 = R49*E49/(1./10+1./5+K49/(E8*D49));
		double S50 = R50*E50/(1./10+1./5+K50/(E8*D50));
		double S51 = R51*E51/(1./10+1./5+K51/(E8*D51));
		double S52 = R52*E52/(1./10+1./5+K52/(E8*D52));
		double S53 = R53*E53/(1./10+1./5+K53/(E8*D53));
		double S54 = R54*E54/(1./10+1./5+K54/(E8*D54));
		double S55 = R55*E55/(1./10+1./5+K55/(E8*D55));
		double S56 = R56*E56/(1./10+1./5+K56/(D56));
		double S57 = 4*(AB5+AC5)*D57*R57*pow3;
		double S58 = 2*0.54*X5*D58*E8*R58*pow3;
		double S59 = 2*0.54*C5*D59*E8*R59*pow3;
		double S60 = 0.54*B5*D60*E8*R60*pow3;
		double S61 = -S51;
		double S62 = R62*E62/(1./10+1./5+K62/(E8*D62));
		double S63 = R63*E63/(1./10+1./5+K63/(E8*D63));
		double S64 = R64*E64/(1./10+1./5+K64/(E8*D64));
		double S65 = R65*E65/(1./10+1./5+K65/(E8*D65));
		double S66 = R66*E66/(1./10+1./5+K66/(E8*D66));
		double S67 = R67*E67/(1./10+1./5+K67/(E8*D67));
		double S68 = R68*E68/(1./10+1./5+K68/(E8*D68));
		double S69 = R69*E69/(1./10+1./5+K69/(E8*D69));
		double S70 = R70*E70/(1./10+1./5+K70/(E8*D70));
		double S71 = R71*E71/(1./10+1./5+K71/(E8*D71));
		double S72 = 4*(AM5+AN5)*D72*R72*pow3;
		double S73 =F28*F29*(1-C30);
		double S74 = 2*0.54*(AL5-L5-O5)*D74*E8*R74*pow3;
		double S75 = 2*0.54*(B5-2*AE5)*D75*E8*R75*pow3;
		double S76 = 2*0.54*C5*D76*E8*R76*pow3;

		double T51 = S51,T56 = S56,T57 = S57,T58 = S58,T59 = S59,T60 = S60,T61 = -T51,T68 = S68, T69 = S69,T72 = S72,T73 = S73,T74 = S74,T75 = S75,T76 = S76;

		double V48 = U48*E48/(1./10+1./5+K48/(F8*D48));
		double V49 = U49*E49/(1./10+1./5+K49/(F8*D49));
		double V50 = U50*E50/(1./10+1./5+K50/(F8*D50));
		double V51 = U51*E51/(1./10+1./5+K51/(F8*D51));
		double V52 = U52*E52/(1./10+1./5+K52/(F8*D52));
		double V53 = U53*E53/(1./10+1./5+K53/(F8*D53));
		double V54 = U54*E54/(1./10+1./5+K54/(F8*D54));
		double V55 = U55*E55/(1./10+1./5+K55/(F8*D55));
		double V56 = U56*E56/(1./10+1./5+K56/(D56));
		double V57 = 4*(AB5+AC5)*D57*U57*pow3;
		double V58 = 2*0.54*X5*D58*F8*U58*pow3;
		double V59 = 2*0.54*C5*D59*F8*U59*pow3;
		double V60 = 0.54*B5*D60*F8*U60*pow3;
		double V61 = -V51;
		double V62 = U62*E62/(1./10+1./5+K62/(F8*D62));
		double V63 = U63*E63/(1./10+1./5+K63/(F8*D63));
		double V64 = U64*E64/(1./10+1./5+K64/(F8*D64));
		double V65 = U65*E65/(1./10+1./5+K65/(F8*D65));
		double V66 = U66*E66/(1./10+1./5+K66/(F8*D66));
		double V67 = U67*E67/(1./10+1./5+K67/(F8*D67));
		double V68 = U68*E68/(1./10+1./5+K68/(F8*D68));
		double V69 = U69*E69/(1./10+1./5+K69/(F8*D69));
		double V70 = U70*E70/(1./10+1./5+K70/(F8*D70));
		double V71 = U71*E71/(1./10+1./5+K71/(F8*D71));
		double V72 = 4*(AM5+AN5)*D72*U72*pow3;
		double V73 = G28*G29*(1-C30);
		double V74 = 2*0.54*(AL5-L5-O5)*D74*E8*U74*pow3;
		double V75 = 2*0.54*(B5-2*AE5)*D75*E8*U75*pow3;
		double V76 = 2*0.54*C5*D76*E8*U76*pow3;
		double W51=V51,W56=V56,W57=V57,	W58=V58,W59=V59,W60=V60,W61=-W51,W68=V68,W69=V69,W72=V72,W73=V73,W74=V74,W75=V75,W76=V76;

		if (H48 > 0) {
			N48 =  ((F48-4*H48*pow33)*(G48-4*H48*pow33)*pow6*L48)*(1./(J48*(1./10+1./5+H48/I48+(K48-H48)/(C8*D48))))+(E48-(F48-4*H48*pow33)*(G48-4*H48*pow33)*pow6)*L48*(1./(1./10+1./5+K48/(D48*C8)));
			Q48 =   ((F48-4*H48*pow33)*(G48-4*H48*pow33)*pow6*O48)*(1./(J48*(1./10+1./5+H48/I48+(K48-H48)/(D48))))+(E48-(F48-4*H48*pow33)*(G48-4*H48*pow33)*pow6)*O48*(1./(1./10+1./5+K48/(D48)));
			T48 = ((F48-4*H48*pow33)*(G48-4*H48*pow33)*pow6*R48)*(1/(J48*(1./10+1./5+H48/(I48*E9)+(K48-H48)/(E8*D48))))+(E48-(F48-4*H48*pow33)*(G48-4*H48*pow33)*pow6)*R48*(1/(1./10+1./5+K48/(D48*E8)));
			W48=  ((F48-4*H48*pow33)*(G48-4*H48*pow33)*pow6*U48)*(1/(J48*(1./10+1./5+H48/(I48*F9)+(K48-H48)/(F8*D48))))+(E48-(F48-4*H48*pow33)*(G48-4*H48*pow33)*pow6)*U48*(1/(1./10+1./5+K48/(D48*F8)));
		} else {
			N48 = M48;
			Q48 = P48;
			T48 = S48;
			W48 = V48;
		}

		if (H49 > 0) {
			N49 =  ((F49-4*H49*pow33)*(G49-4*H49*pow33)*pow6*L49)*(1/(J49*(1./10+1./5+H49/I49+(K49-H49)/(C8*D49))))+(E49-(F49-4*H49*pow33)*(G49-4*H49*pow33)*pow6)*L49*(1/(1./10+1./5+K49/(D49*C8)));
			Q49 =  ((F49-4*H49*pow33)*(G49-4*H49*pow33)*pow6*O49)*(1/(J49*(1./10+1./5+H49/I49+(K49-H49)/(D49))))+(E49-(F49-4*H49*pow33)*(G49-4*H49*pow33)*pow6)*O49*(1/(1./10+1./5+K49/(D49)));
			T49 = ((F49-4*H49*pow33)*(G49-4*H49*pow33)*pow6*R49)*(1/(J49*(1./10+1./5+H49/(I49*E9)+(K49-H49)/(E8*D49))))+(E49-(F49-4*H49*pow33)*(G49-4*H49*pow33)*pow6)*R49*(1/(1./10+1./5+K49/(D49*E8)));
			W49 = ((F49-4*H49*pow33)*(G49-4*H49*pow33)*pow6*U49)*(1/(J49*(1./10+1./5+H49/(I49*F9)+(K49-H49)/(F8*D49))))+(E49-(F49-4*H49*pow33)*(G49-4*H49*pow33)*pow6)*U49*(1/(1./10+1./5+K49/(D49*F8)));
		} else {
			N49 = M49;
			Q49 = P49;
			T49 = S49;
			W49 = V49;
		}

		if (H50 > 0) {
			N50 =  ((F50-4*H50*pow33)*(G50-4*H50*pow33)*pow6*L50)*(1/(J50*(1./10+1./5+H50/I50+(K50-H50)/(C8*D50))))+(E50-(F50-4*H50*pow33)*(G50-4*H50*pow33)*pow6)*L50*(1/(1./10+1./5+K50/(D50*C8)));
			Q50 =   ((F50-4*H50*pow33)*(G50-4*H50*pow33)*pow6*O50)*(1/(J50*(1./10+1./5+H50/I50+(K50-H50)/(D50))))+(E50-(F50-4*H50*pow33)*(G50-4*H50*pow33)*pow6)*O50*(1/(1./10+1./5+K50/(D50)));
			T50 = ((F50-4*H50*pow33)*(G50-4*H50*pow33)*pow6*R50)*(1/(J50*(1./10+1./5+H50/(I50*E9)+(K50-H50)/(E8*D50))))+(E50-(F50-4*H50*pow33)*(G50-4*H50*pow33)*pow6)*R50*(1/(1./10+1./5+K50/(D50*E8)));
			W50 = ((F50-4*H50*pow33)*(G50-4*H50*pow33)*pow6*U50)*(1/(J50*(1./10+1./5+H50/(I50*F9)+(K50-H50)/(F8*D50))))+(E50-(F50-4*H50*pow33)*(G50-4*H50*pow33)*pow6)*U50*(1/(1./10+1./5+K50/(D50*F8)));
		} else {
			Q50 = P50;
			N50 = M50;
			T50 = S50;
			W50 = V50;
		}

		if (H52 > 0) {
			N52 = ((F52-4*H52*pow33)*(G52-4*H52*pow33)*pow6*L52)*(1/(J52*(1./10+1./5+H52/I52+(K52-H52)/(C8*D52))))+(E52-(F52-4*H52*pow33)*(G52-4*H52*pow33)*pow6)*L52*(1/(1./10+1./5+K52/(D52*C8)));
			Q52 =  ((F52-4*H52*pow33)*(G52-4*H52*pow33)*pow6*O52)*(1/(J52*(1./10+1./5+H52/I52+(K52-H52)/(D52))))+(E52-(F52-4*H52*pow33)*(G52-4*H52*pow33)*pow6)*O52*(1/(1./10+1./5+K52/(D52)));
			T52 = ((F52-4*H52*pow33)*(G52-4*H52*pow33)*pow6*R52)*(1/(J52*(1./10+1./5+H52/(I52*E9)+(K52-H52)/(E8*D52))))+(E52-(F52-4*H52*pow33)*(G52-4*H52*pow33)*pow6)*R52*(1/(1./10+1./5+K52/(D52*E8)));
			W52 = ((F52-4*H52*pow33)*(G52-4*H52*pow33)*pow6*U52)*(1/(J52*(1./10+1./5+H52/(I52*F9)+(K52-H52)/(F8*D52))))+(E52-(F52-4*H52*pow33)*(G52-4*H52*pow33)*pow6)*U52*(1/(1./10+1./5+K52/(D52*F8)));
		} else {
			Q52 = P52;
			N52 = M52;
			T52 = S52;
			W52 = V52;
		}

		if (H53 > 0) {
			N53 =  ((F53-4*H53*pow33)*(G53-4*H53*pow33)*pow6*L53)*(1/(J53*(1./10+1./5+H53/I53+(K53-H53)/(C8*D53))))+(E53-(F53-4*H53*pow33)*(G53-4*H53*pow33)*pow6)*L53*(1/(1./10+1./5+K53/(D53*C8)));
			Q53 =   ((F53-4*H53*pow33)*(G53-4*H53*pow33)*pow6*O53)*(1/(J53*(1./10+1./5+H53/I53+(K53-H53)/(D53))))+(E53-(F53-4*H53*pow33)*(G53-4*H53*pow33)*pow6)*O53*(1/(1./10+1./5+K53/(D53)));
			T53 = ((F53-4*H53*pow33)*(G53-4*H53*pow33)*pow6*R53)*(1/(J53*(1./10+1./5+H53/(I53*E9)+(K53-H53)/(E8*D53))))+(E53-(F53-4*H53*pow33)*(G53-4*H53*pow33)*pow6)*R53*(1/(1./10+1./5+K53/(D53*E8)));
			W53 = ((F53-4*H53*pow33)*(G53-4*H53*pow33)*pow6*U53)*(1/(J53*(1./10+1./5+H53/(I53*F9)+(K53-H53)/(F8*D53))))+(E53-(F53-4*H53*pow33)*(G53-4*H53*pow33)*pow6)*U53*(1/(1./10+1./5+K53/(D53*F8)));
		} else {
			Q53 = P53;
			N53 = M53;
			T53 = S53;
			W53 = V53;
		}

		if (H54 > 0) {
			N54 =  ((F54-4*H54*pow33)*(G54-4*H54*pow33)*pow6*L54)*(1/(J54*(1./10+1./5+H54/I54+(K54-H54)/(C8*D54))))+(E54-(F54-4*H54*pow33)*(G54-4*H54*pow33)*pow6)*L54*(1/(1./10+1./5+K54/(D54*C8)));
			Q54 =  ((F54-4*H54*pow33)*(G54-4*H54*pow33)*pow6*O54)*(1/(J54*(1./10+1./5+H54/I54+(K54-H54)/(D54))))+(E54-(F54-4*H54*pow33)*(G54-4*H54*pow33)*pow6)*O54*(1/(1./10+1./5+K54/(D54)));
			T54 = ((F54-4*H54*pow33)*(G54-4*H54*pow33)*pow6*R54)*(1/(J54*(1./10+1./5+H54/(I54*E9)+(K54-H54)/(E8*D54))))+(E54-(F54-4*H54*pow33)*(G54-4*H54*pow33)*pow6)*R54*(1/(1./10+1./5+K54/(D54*E8)));
			W54 = ((F54-4*H54*pow33)*(G54-4*H54*pow33)*pow6*U54)*(1/(J54*(1./10+1./5+H54/(I54*F9)+(K54-H54)/(F8*D54))))+(E54-(F54-4*H54*pow33)*(G54-4*H54*pow33)*pow6)*U54*(1/(1./10+1./5+K54/(D54*F8)));
		} else {
			Q54 = P54;
			N54 = M54;
			T54 = S54;
			W54 = V54;
		}

		if (H55 > 0) {
			N55 =  ((F55-4*H55*pow33)*(G55-4*H55*pow33)*pow6*L55)*(1/(J55*(1./10+1./5+H55/I55+(K55-H55)/(C8*D55))))+(E55-(F55-4*H55*pow33)*(G55-4*H55*pow33)*pow6)*L55*(1/(1./10+1./5+K55/(D55*C8)));
			Q55 =  ((F55-4*H55*pow33)*(G55-4*H55*pow33)*pow6*O55)*(1/(J55*(1./10+1./5+H55/I55+(K55-H55)/(D55))))+(E55-(F55-4*H55*pow33)*(G55-4*H55*pow33)*pow6)*O55*(1/(1./10+1./5+K55/(D55)));
			T55 = ((F55-4*H55*pow33)*(G55-4*H55*pow33)*pow6*R55)*(1/(1./10+1./5+H55/(I55*E9)+(K55-H55)/(E8*D55)))+(E55-(F55-4*H55*pow33)*(G55-4*H55*pow33)*pow6)*R55*(1/(1./10+1./5+K55/(D55*E8)));
			W55 = ((F55-4*H55*pow33)*(G55-4*H55*pow33)*pow6*U55)*(1/(J55*(1./10+1./5+H55/(I55*F9)+(K55-H55)/(F8*D55))))+(E55-(F55-4*H55*pow33)*(G55-4*H55*pow33)*pow6)*U55*(1/(1./10+1./5+K55/(D55*F8)));
		} else {
			Q55 = P55;
			N55 = M55;
			T55 = S55;
			W55 = V55;
		}

		if (H62 > 0) {
			N62 =  ((F62-4*H62*pow33)*(G62-4*H62*pow33)*pow6*L62)*(1/(J62*(1./10+1./5+H62/I62+(K62-H62)/(C8*D62))))+(E62-(F62-4*H62*pow33)*(G62-4*H62*pow33)*pow6)*L62*(1/(1./10+1./5+K62/(D62*C8)));
			Q62 =  ((F62-4*H62*pow33)*(G62-4*H62*pow33)*pow6*O62)*(1/(J62*(1./10+1./5+H62/I62+(K62-H62)/(D62))))+(E62-(F62-4*H62*pow33)*(G62-4*H62*pow33)*pow6)*O62*(1/(1./10+1./5+K62/(D62)));
			T62 = ((F62-4*H62*pow33)*(G62-4*H62*pow33)*pow6*R62)*(1/(J62*(1./10+1./5+H62/(I62*E9)+(K62-H62)/(E8*D62))))+(E62-(F62-4*H62*pow33)*(G62-4*H62*pow33)*pow6)*R62*(1/(1./10+1./5+K62/(D62*E8)));
			W62 = ((F62-4*H62*pow33)*(G62-4*H62*pow33)*pow6*U62)*(1/(J62*(1./10+1./5+H62/(I62*F9)+(K62-H62)/(F8*D62))))+(E62-(F62-4*H62*pow33)*(G62-4*H62*pow33)*pow6)*U62*(1/(1./10+1./5+K62/(D62*F8)));
		} else {
			N62 = M62;
			Q62 = P62;
			T62 = S62;
			W62 = V62;
		}

		if (H63 > 0) {
			N63 =  ((F63-4*H63*pow33)*(G63-4*H63*pow33)*pow6*L63)*(1/(J63*(1./10+1./5+H63/I63+(K63-H63)/(C8*D63))))+(E63-(F63-4*H63*pow33)*(G63-4*H63*pow33)*pow6)*L63*(1/(1./10+1./5+K63/(D63*C8)));
			Q63 = ((F63-4*H63*pow33)*(G63-4*H63*pow33)*pow6*O63)*(1/(J63*(1./10+1./5+H63/I63+(K63-H63)/(D63))))+(E63-(F63-4*H63*pow33)*(G63-4*H63*pow33)*pow6)*O63*(1/(1./10+1./5+K63/(D63)));
			T63 = ((F63-4*H63*pow33)*(G63-4*H63*pow33)*pow6*R63)*(1/(J63*(1./10+1./5+H63/(I63*E9)+(K63-H63)/(E8*D63))))+(E63-(F63-4*H63*pow33)*(G63-4*H63*pow33)*pow6)*R63*(1/(1./10+1./5+K63/(D63*E8)));
			W63 = ((F63-4*H63*pow33)*(G63-4*H63*pow33)*pow6*U63)*(1/(J63*(1./10+1./5+H63/(I63*F9)+(K63-H63)/(F8*D63))))+(E63-(F63-4*H63*pow33)*(G63-4*H63*pow33)*pow6)*U63*(1/(1./10+1./5+K63/(D63*F8)));
		} else {
			N63 = M63;
			Q63 = P63;
			T63 = S63;
			W63 = V63;
		}

		if (H64 > 0) {
			N64 =  ((F64-4*H64*pow33)*(G64-4*H64*pow33)*pow6*L64)*(1/(J64*(1./10+1./5+H64/I64+(K64-H64)/(C8*D64))))+(E64-(F64-4*H64*pow33)*(G64-4*H64*pow33)*pow6)*L64*(1/(1./10+1./5+K64/(D64*C8)));
			Q64 =  ((F64-4*H64*pow33)*(G64-4*H64*pow33)*pow6*O64)*(1/(J64*(1./10+1./5+H64/I64+(K64-H64)/(D64))))+(E64-(F64-4*H64*pow33)*(G64-4*H64*pow33)*pow6)*O64*(1/(1./10+1./5+K64/(D64)));
			T64 = ((F64-4*H64*pow33)*(G64-4*H64*pow33)*pow6*R64)*(1/(J64*(1./10+1./5+H64/(I64*E9)+(K64-H64)/(E8*D64))))+(E64-(F64-4*H64*pow33)*(G64-4*H64*pow33)*pow6)*R64*(1/(1./10+1./5+K64/(D64*E8)));
			W64 = ((F64-4*H64*pow33)*(G64-4*H64*pow33)*pow6*U64)*(1/(J64*(1./10+1./5+H64/(I64*F9)+(K64-H64)/(F8*D64))))+(E64-(F64-4*H64*pow33)*(G64-4*H64*pow33)*pow6)*U64*(1/(1./10+1./5+K64/(D64*F8)));
		} else {
			Q64 = P64;
			N64 = M64;
			T64 = S64;
			W64 = V64;
		}

		if (H65 > 0) {
			N65 =  ((F65-4*H65*pow33)*(G65-4*H65*pow33)*pow6*L65)*(1/(J65*(1./10+1./5+H65/I65+(K65-H65)/(C8*D65))))+(E65-(F65-4*H65*pow33)*(G65-4*H65*pow33)*pow6)*L65*(1/(1./10+1./5+K65/(D65*C8)));
			Q65 =  ((F65-4*H65*pow33)*(G65-4*H65*pow33)*pow6*O65)*(1/(J65*(1./10+1./5+H65/I65+(K65-H65)/(D65))))+(E65-(F65-4*H65*pow33)*(G65-4*H65*pow33)*pow6)*O65*(1/(1./10+1./5+K65/(D65)));
			T65 = ((F65-4*H65*pow33)*(G65-4*H65*pow33)*pow6*R65)*(1/(J65*(1./10+1./5+H65/(I65*E9)+(K65-H65)/(E8*D65))))+(E65-(F65-4*H65*pow33)*(G65-4*H65*pow33)*pow6)*R65*(1/(1./10+1./5+K65/(D65*E8)));
			W65 = ((F65-4*H65*pow33)*(G65-4*H65*pow33)*pow6*U65)*(1/(J65*(1./10+1./5+H65/(I65*F9)+(K65-H65)/(F8*D65))))+(E65-(F65-4*H65*pow33)*(G65-4*H65*pow33)*pow6)*U65*(1/(1./10+1./5+K65/(D65*F8)));
		} else {
			Q65 = P65;
			N65 = M65;
			T65 = S65;
			W65 = V65;
		}

		if (H66 > 0) {
			N66 = ((F66-4*H66*pow33)*(G66-4*H66*pow33)*pow6*L66)*(1/(J66*(1./10+1./5+H66/I66+(K66-H66)/(C8*D66))))+(E66-(F66-4*H66*pow33)*(G66-4*H66*pow33)*pow6)*L66*(1/(1./10+1./5+K66/(D66*C8)));
			Q66 =   ((F66-4*H66*pow33)*(G66-4*H66*pow33)*pow6*O66)*(1/(J66*(1./10+1./5+H66/I66+(K66-H66)/(D66))))+(E66-(F66-4*H66*pow33)*(G66-4*H66*pow33)*pow6)*O66*(1/(1./10+1./5+K66/(D66)));
			T66 = ((F66-4*H66*pow33)*(G66-4*H66*pow33)*pow6*R66)*(1/(J66*(1./10+1./5+H66/(I66*E9)+(K66-H66)/(E8*D66))))+(E66-(F66-4*H66*pow33)*(G66-4*H66*pow33)*pow6)*R66*(1/(1./10+1./5+K66/(D66*E8)));
			W66 = ((F66-4*H66*pow33)*(G66-4*H66*pow33)*pow6*U66)*(1/(J66*(1./10+1./5+H66/(I66*F9)+(K66-H66)/(F8*D66))))+(E66-(F66-4*H66*pow33)*(G66-4*H66*pow33)*pow6)*U66*(1/(1./10+1./5+K66/(D66*F8)));
		} else {
			Q66 = P66;
			N66 = M66;
			T66 = S66;
			W66 = V66;
		}

		if (H67 > 0) {
			N67 =  ((F67-4*H67*pow33)*(G67-4*H67*pow33)*pow6*L67)*(1/(J67*(1./10+1./5+H67/I67+(K67-H67)/(C8*D67))))+(E67-(F67-4*H67*pow33)*(G67-4*H67*pow33)*pow6)*L67*(1/(1./10+1./5+K67/(D67*C8)));
			Q67 =  ((F67-4*H67*pow33)*(G67-4*H67*pow33)*pow6*O67)*(1/(J67*(1./10+1./5+H67/I67+(K67-H67)/(D67))))+(E67-(F67-4*H67*pow33)*(G67-4*H67*pow33)*pow6)*O67*(1/(1./10+1./5+K67/(D67)));
			T67 = ((F67-4*H67*pow33)*(G67-4*H67*pow33)*pow6*R67)*(1/(J67*(1./10+1./5+H67/(I67*E9)+(K67-H67)/(E8*D67))))+(E67-(F67-4*H67*pow33)*(G67-4*H67*pow33)*pow6)*R67*(1/(1./10+1./5+K67/(D67*E8)));
			W67 = ((F67-4*H67*pow33)*(G67-4*H67*pow33)*pow6*U67)*(1/(J67*(1./10+1./5+H67/(I67*F9)+(K67-H67)/(F8*D67))))+(E67-(F67-4*H67*pow33)*(G67-4*H67*pow33)*pow6)*U67*(1/(1./10+1./5+K67/(D67*F8)));
		} else {
			Q67 = P67;
			N67 = M67;
			T67 = S67;
			W67 = V67;
		}

		if (H70 > 0) {
			N70 =  ((F70-4*H70*pow33)*(G70-4*H70*pow33)*pow6*L70)*(1/(J70*(1./10+1./5+H70/I70+(K70-H70)/(C8*D70))))+(E70-(F70-4*H70*pow33)*(G70-4*H70*pow33)*pow6)*L70*(1/(1./10+1./5+K70/(D70*C8)));
			Q70 = ((F70-4*H70*pow33)*(G70-4*H70*pow33)*pow6*O70)*(1/(J70*(1./10+1./5+H70/I70+(K70-H70)/(D70))))+(E70-(F70-4*H70*pow33)*(G70-4*H70*pow33)*pow6)*O70*(1/(1./10+1./5+K70/(D70)));
			T70 = ((F70-4*H70*pow33)*(G70-4*H70*pow33)*pow6*R70)*(1/(J70*(1./10+1./5+H70/I70+(K70-H70)/(E8*D70))))+(E70-(F70-4*H70*pow33)*(G70-4*H70*pow33)*pow6)*R70*(1/(1./10+1./5+K70/(D70*E8)));
			W70 = ((F70-4*H70*pow33)*(G70-4*H70*pow33)*pow6*U70)*(1/(J70*(1./10+1./5+H70/(I70*F9)+(K70-H70)/(F8*D70))))+(E70-(F70-4*H70*pow33)*(G70-4*H70*pow33)*pow6)*U70*(1/(1./10+1./5+K70/(D70*F8)));
		} else {
			Q70 = P70;
			N70 = M70;
			T70 = S70;
			W70 = V70;
		}

		if (H71 > 0) {
			N71 =  ((F71-4*H71*pow33)*(G71-4*H71*pow33)*pow6*L71)*(1/(J71*(1./10+1./5+H71/I71+(K71-H71)/(C8*D71))))+(E71-(F71-4*H71*pow33)*(G71-4*H71*pow33)*pow6)*L71*(1/(1./10+1./5+K71/(D71*C8)));
			Q71 =  ((F71-4*H71*pow33)*(G71-4*H71*pow33)*pow6*O71)*(1/(1./10+1./5+H71/I71+(K71-H71)/(D71)))+(E71-(F71-4*H71*pow33)*(G71-4*H71*pow33)*pow6)*O71*(1/(1./10+1./5+K71/(D71)));
			T71 = ((F71-4*H71*pow33)*(G71-4*H71*pow33)*pow6*R71)*(1/(J71*(1./10+1./5+H71/(I71*E9)+(K71-H71)/(E8*D71))))+(E71-(F71-4*H71*pow33)*(G71-4*H71*pow33)*pow6)*R71*(1/(1./10+1./5+K71/(D71*E8)));
			W71 = ((F71-4*H71*pow33)*(G71-4*H71*pow33)*pow6*U71)*(1/(J71*(1./10+1./5+H71/(I71*F9)+(K71-H71)/(F8*D71))))+(E71-(F71-4*H71*pow33)*(G71-4*H71*pow33)*pow6)*U71*(1/(1./10+1./5+K71/(D71*F8)));
		} else {
			Q71 = P71;
			N71 = M71;
			T71 = S71;
			W71 = V71;
		}
		double Msum = M48 + M49 + M50 + M51 + M52 + M53 + M54 + M55 + M56 + M57 + M58 + M59 + M60 + M61 + M62 + M63 + M64 + M65 + M66 + M67+ M68 + M69 + M70 + M71 + M72 + M73 + M74 + M75 + M76;
		double Nsum = N48 + N49 + N50 + N51 + N52 + N53 + N54 + N55 + N56 + N57 + N58 + N59 + N60 + N61 + N62 + N63 + N64 + N65 + N66 + N67+ N68 + N69 + N70 + N71 + N72 + N73 + N74 + N75 + N76;
		double Psum = P48 + P49 + P50 + P51 + P52 + P53 + P54 + P55 + P56 + P57 + P58 + P59 + P60 + P61 + P62 + P63 + P64 + P65 + P66 + P67+ P68 + P69 + P70 + P71 + P72 + P73 + P74 + P75 + P76;
		double Qsum = Q48 + Q49 + Q50 + Q51 + Q52 + Q53 + Q54 + Q55 + Q56 + Q57	+ Q58 + Q59 + Q60 + Q61 + Q62 + Q63 + Q64 + Q65 + Q66 + Q67	+ Q68 + Q69 + Q70 + Q71 + Q72 + Q73 + Q74 + Q75 + Q76;

		double Ssum = S48 + S49 + S50 + S51 + S52 + S53 + S54 + S55 + S56 + S57	+ S58 + S59 + S60 + S61 + S62 + S63 + S64 + S65 + S66 + S67	+ S68 + S69 + S70 + S71 + S72 + S73 + S74 + S75 + S76;
		double Tsum = T48 + T49 + T50 + T51 + T52 + T53 + T54 + T55 + T56 + T57	+ T58 + T59 + T60 + T61 + T62 + T63 + T64 + T65 + T66 + T67	+ T68 + T69 + T70 + T71 + T72 + T73 + T74 + T75 + T76;
		double Vsum = V48 + V49 + V50 + V51 + V52 + V53 + V54 + V55 + V56 + V57	+ V58 + V59 + V60 + V61 + V62 + V63 + V64 + V65 + V66 + V67	+ V68 + V69 + V70 + V71 + V72 + V73 + V74 + V75 + V76;
		double Wsum = W48 + W49 + W50 + W51 + W52 + W53 + W54 + W55 + W56 + W57	+ W58 + W59 + W60 + W61 + W62 + W63 + W64 + W65 + W66 + W67	+ W68 + W69 + W70 + W71 + W72 + W73 + W74 + W75 + W76;

		vip.M77 = Msum;
		vip.P77 = Psum;
		vip.S77 = Ssum;
		vip.V77 = Vsum;

		double sss = 100;

		if (aa <= 0) {
			vip.areaShengYu =0;
			vip.areaTuiJian = 0;
			vip.b2bsmall = 0; // 52
			vip.a2bsmall = 0;
			vip.A2bsmall = 0;
			vip.B2bsmall = 0;

			vip.b2bbig = 0; // 53  
			vip.a2bbig = 0;
			vip.A2bbig = 0;
			vip.B2bbig = 0;

			vip.a1b = 0; // 67 ld back
			vip.b1b = 0;
			vip.A1b = 0;
			vip.B1b = 0;

			vip.a1l = 0; // 62 ld left up
			vip.b1l = 0;
			vip.A1l = 0;
			vip.B1l = 0;

			vip.a1r = 0; // 63 ld right up ¿‰∂≥ “ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“
			vip.b1r = 0;
			vip.A1r = 0;
			vip.B1r = 0;

			vip.a1ldown = 0; // 64 ld left down ¿‰∂≥ “◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Ûœ¬œ¬
			vip.b1ldown = 0;
			vip.A1ldown = 0;
			vip.B1ldown = 0;

			vip.a1rdown = 0; // 65 ld right down ¿‰∂≥ “ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“
			vip.b1rdown = 0;
			vip.A1rdown = 0;
			vip.B1rdown = 0;

			vip.b2l = 0; // 49 lc left
			vip.a2l = 0;
			vip.A2l = 0;
			vip.B2l = 0;

			vip.b2r = 0; // 50 lc right
			vip.a2r = 0;
			vip.A2r = 0;
			vip.B2r = 0;

			vip.b1rd = 0; // 70 ld right door ¿‰∂≥ “
			vip.a1rd = 0;
			vip.A1rd = 0;
			vip.B1rd = 0;

			vip.b1ld = 0; // 71 ld left door ¿‰∂≥ “
			vip.a1ld = 0;
			vip.A1ld = 0;
			vip.B1ld = 0;

			vip.b2rd = 0; // 54 lc right door
			vip.a2rd = 0;
			vip.A2rd = 0;
			vip.B2rd = 0;

			vip.b2ld = 0; // 55 lc left door
			vip.a2ld = 0;
			vip.A2ld = 0;
			vip.B2ld = 0;

			vip.b2t = 0; // 48 lc top
			vip.a2t = 0;
			vip.A2t = 0;
			vip.B2t = 0;

			vip.a1bo = 0;// 66 ld bottom
			vip.b1bo = 0;
			vip.A1bo = 0;
			vip.B1bo = 0;

			System.out.println("aa<=0");
		} else if (aa > 0 && aa < s1) {
			vip.areaShengYu = 0;
			vip.areaTuiJian = 0;
			double a = vip.a2bsmall, b = vip.b2bsmall, h = vip.h2bsmall, w = vip.w2bsmall;

			int x = 0, y = 0;
			Nsum = Nsum - N52;
			Qsum = Qsum - Q52;
			Tsum = Tsum - T52;
			Wsum = Wsum - W52;

			for (int i = (int) a; aa / i <= b; i--) {

				N52 = ((i-4*H52*pow33)*(aa / i-4*H52*pow33)*pow6*L52)*(1/(J52*(1./10+1./5+H52/I52+(K52-H52)/(C8*D52))))+(E52-(i-4*H52*pow33)*(aa / i-4*H52*pow33)*pow6)*L52*(1/(1./10+1./5+K52/(D52*C8)));
				if (sss >= N52) {
					sss = N52;
					x = i;
					y = (int) aa / i;
				}
			}

			vip.a2bsmall = x;
			vip.b2bsmall = y;
			vip.A2bsmall = (w - vip.a2bsmall) / 2;
			vip.B2bsmall = (h - vip.b2bsmall) / 2;

			F52 = vip.a2bsmall;
			G52 = vip.b2bsmall;
			N52 = sss;

//			System.out.println("—≠ª∑“‘∫Û N52="+N52);
			Q52 =  ((F52-4*H52*pow33)*(G52-4*H52*pow33)*pow6*O52)*(1/(J52*(1./10+1./5+H52/I52+(K52-H52)/(D52))))+(E52-(F52-4*H52*pow33)*(G52-4*H52*pow33)*pow6)*O52*(1/(1./10+1./5+K52/(D52)));
			T52 = ((F52-4*H52*pow33)*(G52-4*H52*pow33)*pow6*R52)*(1/(J52*(1./10+1./5+H52/(I52*E9)+(K52-H52)/(E8*D52))))+(E52-(F52-4*H52*pow33)*(G52-4*H52*pow33)*pow6)*R52*(1/(1./10+1./5+K52/(D52*E8)));
			W52 = ((F52-4*H52*pow33)*(G52-4*H52*pow33)*pow6*U52)*(1/(J52*(1./10+1./5+H52/(I52*F9)+(K52-H52)/(F8*D52))))+(E52-(F52-4*H52*pow33)*(G52-4*H52*pow33)*pow6)*U52*(1/(1./10+1./5+K52/(D52*F8)));
			Nsum = Nsum + N52;
			Qsum = Qsum + Q52;
			Tsum = Tsum + T52;
			Wsum = Wsum + W52;

			vip.b2bbig = 0; // 53
			vip.a2bbig = 0;
			vip.A2bbig = 0;
			vip.B2bbig = 0;

			vip.a1b = 0; // 67 ld back
			vip.b1b = 0;
			vip.A1b = 0;
			vip.B1b = 0;

			vip.a1l = 0; // 62 ld left up
			vip.b1l = 0;
			vip.A1l = 0;
			vip.B1l = 0;

			vip.a1r = 0; // 63 ld right up ¿‰∂≥ “ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“
			vip.b1r = 0;
			vip.A1r = 0;
			vip.B1r = 0;

			vip.a1ldown = 0; // 64 ld left down ¿‰∂≥ “◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Ûœ¬œ¬
			vip.b1ldown = 0;
			vip.A1ldown = 0;
			vip.B1ldown = 0;

			vip.a1rdown = 0; // 65 ld right down ¿‰∂≥ “ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“
			vip.b1rdown = 0;
			vip.A1rdown = 0;
			vip.B1rdown = 0;

			vip.b2l = 0; // 49 lc left
			vip.a2l = 0;
			vip.A2l = 0;
			vip.B2l = 0;

			vip.b2r = 0; // 50 lc right
			vip.a2r = 0;
			vip.A2r = 0;
			vip.B2r = 0;

			vip.b1rd = 0; // 70 ld right door ¿‰∂≥ “
			vip.a1rd = 0;
			vip.A1rd = 0;
			vip.B1rd = 0;

			vip.b1ld = 0; // 71 ld left door ¿‰∂≥ “
			vip.a1ld = 0;
			vip.A1ld = 0;
			vip.B1ld = 0;

			vip.b2rd = 0; // 54 lc right door
			vip.a2rd = 0;
			vip.A2rd = 0;
			vip.B2rd = 0;

			vip.b2ld = 0; // 55 lc left door
			vip.a2ld = 0;
			vip.A2ld = 0;
			vip.B2ld = 0;

			vip.a1bo = 0; // 66 ld bottom
			vip.b1bo = 0;
			vip.A1bo = 0;
			vip.B1bo = 0;

			vip.b2t = 0; // 48 lc top
			vip.a2t = 0;
			vip.A2t = 0;
			vip.B2t = 0;

			System.out.println("0<aa<s1");

		} else if (aa >= s1 && aa < (s1 + s2)) {
			vip.areaShengYu = (aa-s1)*pow6;
			vip.areaTuiJian = s1*pow6;
			double a =(vip.a2bbig+vip.supply), b = vip.b2bbig, h = vip.h2bbig, w = vip.w2bbig;
			int x = 0, y = 0;

			Nsum = Nsum - N53;
			Qsum = Qsum - Q53;
			Tsum = Tsum - T53;
			Wsum = Wsum - W53;
			for (int i = (int) a; i > vip.a2bsmall; i--) {
				if (aa / i >= vip.b2bsmall && aa / i <= b) {

					N53 =  ((i-4*H53*pow33)*(aa / i-4*H53*pow33)*pow6*L53)*(1/(J53*(1./10+1./5+H53/I53+(K53-H53)/(C8*D53))))+(E53-(i-4*H53*pow33)*(aa / i-4*H53*pow33)*pow6)*L53*(1/(1./10+1./5+K53/(D53*C8)));
					if (sss >= N53) {
						sss = N53;
						x = i;
						y = (int) aa / i;
					}
				}
			}

			vip.a2bbig = x-vip.supply;
			vip.b2bbig = y;
			vip.A2bbig = (w - vip.a2bbig-vip.supply) / 2;
			vip.B2bbig = (h - vip.b2bbig) / 2;

			N53 = sss;
			F53 = x;
			G53 = y;

			Q53 = ((F53-4*H53*pow33)*(G53-4*H53*pow33)*pow6*O53)*(1/(J53*(1./10+1./5+H53/I53+(K53-H53)/(D53))))+(E53-(F53-4*H53*pow33)*(G53-4*H53*pow33)*pow6)*O53*(1/(1./10+1./5+K53/(D53)));
			T53 = ((F53-4*H53*pow33)*(G53-4*H53*pow33)*pow6*R53)*(1/(J53*(1./10+1./5+H53/(I53*E9)+(K53-H53)/(E8*D53))))+(E53-(F53-4*H53*pow33)*(G53-4*H53*pow33)*pow6)*R53*(1/(1./10+1./5+K53/(D53*E8)));
			W53 = ((F53-4*H53*pow33)*(G53-4*H53*pow33)*pow6*U53)*(1/(J53*(1./10+1./5+H53/(I53*F9)+(K53-H53)/(F8*D53))))+(E53-(F53-4*H53*pow33)*(G53-4*H53*pow33)*pow6)*U53*(1/(1./10+1./5+K53/(D53*F8)));
			Nsum = Nsum + N53;
			Qsum = Qsum + Q53;
			Tsum = Tsum + T53;
			Wsum = Wsum + W53;

			vip.b2bsmall = 0; // 52
			vip.a2bsmall = 0;
			vip.A2bsmall = 0;
			vip.B2bsmall = 0;

			vip.a1b = 0; // 67 ld back
			vip.b1b = 0;
			vip.A1b = 0;
			vip.B1b = 0;

			vip.a1l = 0; // 62 ld left up
			vip.b1l = 0;
			vip.A1l = 0;
			vip.B1l = 0;

			vip.a1r = 0; // 63 ld right up ¿‰∂≥ “ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“
			vip.b1r = 0;
			vip.A1r = 0;
			vip.B1r = 0;

			vip.a1ldown = 0; // 64 ld left down ¿‰∂≥ “◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Ûœ¬œ¬
			vip.b1ldown = 0;
			vip.A1ldown = 0;
			vip.B1ldown = 0;

			vip.a1rdown = 0; // 65 ld right down ¿‰∂≥ “ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“
			vip.b1rdown = 0;
			vip.A1rdown = 0;
			vip.B1rdown = 0;

			vip.b2l = 0; // 49 lc left
			vip.a2l = 0;
			vip.A2l = 0;
			vip.B2l = 0;

			vip.b2r = 0; // 50 lc right
			vip.a2r = 0;
			vip.A2r = 0;
			vip.B2r = 0;

			vip.b1rd = 0; // 70 ld right door ¿‰∂≥ “
			vip.a1rd = 0;
			vip.A1rd = 0;
			vip.B1rd = 0;

			vip.b1ld = 0; // 71 ld left door ¿‰∂≥ “
			vip.a1ld = 0;
			vip.A1ld = 0;
			vip.B1ld = 0;

			vip.b2rd = 0; // 54 lc right door
			vip.a2rd = 0;
			vip.A2rd = 0;
			vip.B2rd = 0;

			vip.b2ld = 0; // 55 lc left door
			vip.a2ld = 0;
			vip.A2ld = 0;
			vip.B2ld = 0;

			vip.a1bo = 0; // 66 ld bottom
			vip.b1bo = 0;
			vip.A1bo = 0;
			vip.B1bo = 0;

			vip.b2t = 0; // 48 lc top
			vip.a2t = 0;
			vip.A2t = 0;
			vip.B2t = 0;

			System.out.println("s1 < aa < (s1+s2)");

		} else if (aa >= (s1 + s2) && aa < (s1 + s2 + s3)) {
			vip.areaShengYu = (aa-s1-s2)*pow6;
			vip.areaTuiJian = (s1 + s2)*pow6;
			double a = vip.a1b, b = vip.b1b, h = vip.h1b, w = vip.w1b;

			int x = 0, y = 0;
			Nsum = Nsum - N67;
			Qsum = Qsum - Q67;
			Tsum = Tsum - T67;
			Wsum = Wsum - W67;
			for (int i = (int) a; (aa - s1 - s2) / i <= b; i--) {
				N67 =  ((i-4*H67*pow33)*((aa - s1 - s2) / i-4*H67*pow33)*pow6*L67)*(1/(J67*(1./10+1./5+H67/I67+(K67-H67)/(C8*D67))))+(E67-(i-4*H67*pow33)*((aa - s1 - s2) / i-4*H67*pow33)*pow6)*L67*(1/(1./10+1./5+K67/(D67*C8)));
				if (sss >= N67) {
					sss = N67;
					x = i;
					y = (int) (aa - s1 - s2) / i;
				}
			}
			F67 = x;
			G67 = y;
			Q67 =  ((F67-4*H67*pow33)*(G67-4*H67*pow33)*pow6*O67)*(1/(J67*(1./10+1./5+H67/I67+(K67-H67)/(D67))))+(E67-(F67-4*H67*pow33)*(G67-4*H67*pow33)*pow6)*O67*(1/(1./10+1./5+K67/(D67)));
			T67 = ((F67-4*H67*pow33)*(G67-4*H67*pow33)*pow6*R67)*(1/(J67*(1./10+1./5+H67/(I67*E9)+(K67-H67)/(E8*D67))))+(E67-(F67-4*H67*pow33)*(G67-4*H67*pow33)*pow6)*R67*(1/(1./10+1./5+K67/(D67*E8)));
			W67 = ((F67-4*H67*pow33)*(G67-4*H67*pow33)*pow6*U67)*(1/(J67*(1./10+1./5+H67/(I67*F9)+(K67-H67)/(F8*D67))))+(E67-(F67-4*H67*pow33)*(G67-4*H67*pow33)*pow6)*U67*(1/(1./10+1./5+K67/(D67*F8)));
			N67 = sss;
			Nsum = Nsum + N67;
			Qsum = Qsum + Q67;
			Tsum = Tsum + T67;
			Wsum = Wsum + W67;
			vip.a1b = x;
			vip.b1b = y;
			vip.A1b = (vip.w1b - vip.a1b) / 2;
			vip.B1b = (vip.h1b - vip.b1b) / 2;

			vip.b2bsmall = 0; // 52
			vip.a2bsmall = 0;
			vip.A2bsmall = 0;
			vip.B2bsmall = 0;

			vip.a1l = 0; // 62 ld left up
			vip.b1l = 0;
			vip.A1l = 0;
			vip.B1l = 0;

			vip.a1r = 0; // 63 ld right up ¿‰∂≥ “ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“
			vip.b1r = 0;
			vip.A1r = 0;
			vip.B1r = 0;

			vip.a1ldown = 0; // 64 ld left down ¿‰∂≥ “◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Ûœ¬œ¬
			vip.b1ldown = 0;
			vip.A1ldown = 0;
			vip.B1ldown = 0;

			vip.a1rdown = 0; // 65 ld right down ¿‰∂≥ “ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“
			vip.b1rdown = 0;
			vip.A1rdown = 0;
			vip.B1rdown = 0;

			vip.b2l = 0; // 49 lc left
			vip.a2l = 0;
			vip.A2l = 0;
			vip.B2l = 0;

			vip.b2r = 0; // 50 lc right
			vip.a2r = 0;
			vip.A2r = 0;
			vip.B2r = 0;

			vip.b1rd = 0; // 70 ld right door ¿‰∂≥ “
			vip.a1rd = 0;
			vip.A1rd = 0;
			vip.B1rd = 0;

			vip.b1ld = 0; // 71 ld left door ¿‰∂≥ “
			vip.a1ld = 0;
			vip.A1ld = 0;
			vip.B1ld = 0;

			vip.b2rd = 0; // 54 lc right door
			vip.a2rd = 0;
			vip.A2rd = 0;
			vip.B2rd = 0;

			vip.b2ld = 0; // 55 lc left door
			vip.a2ld = 0;
			vip.A2ld = 0;
			vip.B2ld = 0;

			vip.a1bo = 0; // 66 ld bottom
			vip.b1bo = 0;
			vip.A1bo = 0;
			vip.B1bo = 0;

			vip.b2t = 0; // 48 lc top
			vip.a2t = 0;
			vip.A2t = 0;
			vip.B2t = 0;
			System.out.println("(s1+s2)< aa< (s1+s2+s3)");
		} else if (aa >= (s1 + s2 + s3) && aa < (s1 + s2 + s3 + s4)) {
			vip.areaShengYu = (aa-s1-s2-s3)*pow6;
			vip.areaTuiJian = (s1 + s2+ s3)*pow6;
			double a = vip.a1l, b = vip.b1l, h = vip.h1l, w = vip.w1l;

			int x = 0, y = 0;
			Nsum = Nsum - N62;
			Qsum = Qsum - Q62;
			Tsum = Tsum - T62;
			Wsum = Wsum - W62;
			for (int i = (int) a; (aa - s1 - s2 - s3) / i <= b; i--) {
				N62 =  ((i-4*H62*pow33)*((aa - s1 - s2 - s3) / i-4*H62*pow33)*pow6*L62)*(1/(J62*(1./10+1./5+H62/I62+(K62-H62)/(C8*D62))))+(E62-(i-4*H62*pow33)*((aa - s1 - s2 - s3) / i-4*H62*pow33)*pow6)*L62*(1/(1./10+1./5+K62/(D62*C8)));
				if (sss >= N62) {
					sss = N62;
					x = i;
					y = (int) (aa - s1 - s2 - s3) / i;
				}
			}

			N62 = sss;
			F62 = x;
			G62 = y;
			Q62 =  ((F62-4*H62*pow33)*(G62-4*H62*pow33)*pow6*O62)*(1/(J62*(1./10+1./5+H62/I62+(K62-H62)/(D62))))+(E62-(F62-4*H62*pow33)*(G62-4*H62*pow33)*pow6)*O62*(1/(1./10+1./5+K62/(D62)));
			T62 = ((F62-4*H62*pow33)*(G62-4*H62*pow33)*pow6*R62)*(1/(J62*(1./10+1./5+H62/(I62*E9)+(K62-H62)/(E8*D62))))+(E62-(F62-4*H62*pow33)*(G62-4*H62*pow33)*pow6)*R62*(1/(1./10+1./5+K62/(D62*E8)));
			W62 = ((F62-4*H62*pow33)*(G62-4*H62*pow33)*pow6*U62)*(1/(J62*(1./10+1./5+H62/(I62*F9)+(K62-H62)/(F8*D62))))+(E62-(F62-4*H62*pow33)*(G62-4*H62*pow33)*pow6)*U62*(1/(1./10+1./5+K62/(D62*F8)));
			Nsum = Nsum + N62;
			Qsum = Qsum + Q62;
			Tsum = Tsum + T62;
			Wsum = Wsum + W62;
			vip.a1l = x;
			vip.b1l = y;
			vip.A1l = (vip.w1l - vip.a1l) / 2;
			vip.B1l = (vip.h1l - vip.b1l) / 2;

			vip.b2bsmall = 0; // 52
			vip.a2bsmall = 0;
			vip.A2bsmall = 0;
			vip.B2bsmall = 0;

			vip.a1r = 0; // 63 ld right up ¿‰∂≥ “ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“
			vip.b1r = 0;
			vip.A1r = 0;
			vip.B1r = 0;

			vip.a1ldown = 0; // 64 ld left down ¿‰∂≥ “◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Ûœ¬œ¬
			vip.b1ldown = 0;
			vip.A1ldown = 0;
			vip.B1ldown = 0;

			vip.a1rdown = 0; // 65 ld right down ¿‰∂≥ “ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“
			vip.b1rdown = 0;
			vip.A1rdown = 0;
			vip.B1rdown = 0;

			vip.b2l = 0; // 49 lc left
			vip.a2l = 0;
			vip.A2l = 0;
			vip.B2l = 0;

			vip.b2r = 0; // 50 lc right
			vip.a2r = 0;
			vip.A2r = 0;
			vip.B2r = 0;

			vip.b1rd = 0; // 70 ld right door ¿‰∂≥ “
			vip.a1rd = 0;
			vip.A1rd = 0;
			vip.B1rd = 0;

			vip.b1ld = 0; // 71 ld left door ¿‰∂≥ “
			vip.a1ld = 0;
			vip.A1ld = 0;
			vip.B1ld = 0;

			vip.b2rd = 0; // 54 lc right door
			vip.a2rd = 0;
			vip.A2rd = 0;
			vip.B2rd = 0;

			vip.b2ld = 0; // 55 lc left door
			vip.a2ld = 0;
			vip.A2ld = 0;
			vip.B2ld = 0;

			vip.a1bo = 0; // 66 ld bottom
			vip.b1bo = 0;
			vip.A1bo = 0;
			vip.B1bo = 0;

			vip.b2t = 0; // 48 lc top
			vip.a2t = 0;
			vip.A2t = 0;
			vip.B2t = 0;

			System.out.println("aa>=(s1+s2+s3) && aa<(s1+s2+s3+s4)");
		} else if (aa >= (s1 + s2 + s3 + s4) && aa < (s1 + s2 + s3 + s4 + s5)) {
			vip.areaShengYu = (aa-s1-s2-s3-s4)*pow6;
			vip.areaTuiJian = (s1 + s2+ s3+ s4)*pow6;
			double a = vip.a1r, b = vip.b1r, h = vip.h1r, w = vip.w1r;

			int x = 0, y = 0;
			Nsum = Nsum - N63;
			Qsum = Qsum - Q63;
			Tsum = Tsum - T63;
			Wsum = Wsum - W63;
			for (int i = (int) a; (aa - s1 - s2 - s3 - s4) / i <= b; i--) {
				N63 =  ((i-4*H63*pow33)*((aa - s1 - s2 - s3 - s4) / i-4*H63*pow33)*pow6*L63)*(1/(J63*(1./10+1./5+H63/I63+(K63-H63)/(C8*D63))))+(E63-(i-4*H63*pow33)*((aa - s1 - s2 - s3 - s4) / i-4*H63*pow33)*pow6)*L63*(1/(1./10+1./5+K63/(D63*C8)));
				if (sss >= N63) {
					sss = N63;
					x = i;
					y = (int) (aa - s1 - s2 - s3 - s4) / i;
				}
			}
			N63 = sss;
			F63 = x;
			G63 = y;
			Q63 = ((F63-4*H63*pow33)*(G63-4*H63*pow33)*pow6*O63)*(1/(J63*(1./10+1./5+H63/I63+(K63-H63)/(D63))))+(E63-(F63-4*H63*pow33)*(G63-4*H63*pow33)*pow6)*O63*(1/(1./10+1./5+K63/(D63)));
			T63 = ((F63-4*H63*pow33)*(G63-4*H63*pow33)*pow6*R63)*(1/(J63*(1./10+1./5+H63/(I63*E9)+(K63-H63)/(E8*D63))))+(E63-(F63-4*H63*pow33)*(G63-4*H63*pow33)*pow6)*R63*(1/(1./10+1./5+K63/(D63*E8)));
			W63 = ((F63-4*H63*pow33)*(G63-4*H63*pow33)*pow6*U63)*(1/(J63*(1./10+1./5+H63/(I63*F9)+(K63-H63)/(F8*D63))))+(E63-(F63-4*H63*pow33)*(G63-4*H63*pow33)*pow6)*U63*(1/(1./10+1./5+K63/(D63*F8)));
			Nsum = Nsum + N63;
			Qsum = Qsum + Q63;
			Tsum = Tsum + T63;
			Wsum = Wsum + W63;
			vip.a1r = x;
			vip.b1r = y;
			vip.A1r = (w - vip.a1r) / 2;
			vip.B1r = (h - vip.b1r) / 2;

			vip.b2bsmall = 0; // 52
			vip.a2bsmall = 0;
			vip.A2bsmall = 0;
			vip.B2bsmall = 0;

			vip.a1ldown = 0; // 64 ld left down ¿‰∂≥ “◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Û◊Ûœ¬œ¬
			vip.b1ldown = 0;
			vip.A1ldown = 0;
			vip.B1ldown = 0;

			vip.a1rdown = 0; // 65 ld right down ¿‰∂≥ “ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“
			vip.b1rdown = 0;
			vip.A1rdown = 0;
			vip.B1rdown = 0;

			vip.b2l = 0; // 49 lc left
			vip.a2l = 0;
			vip.A2l = 0;
			vip.B2l = 0;

			vip.b2r = 0; // 50 lc right
			vip.a2r = 0;
			vip.A2r = 0;
			vip.B2r = 0;

			vip.b1rd = 0; // 70 ld right door ¿‰∂≥ “
			vip.a1rd = 0;
			vip.A1rd = 0;
			vip.B1rd = 0;

			vip.b1ld = 0; // 71 ld left door ¿‰∂≥ “
			vip.a1ld = 0;
			vip.A1ld = 0;
			vip.B1ld = 0;

			vip.b2rd = 0; // 54 lc right door
			vip.a2rd = 0;
			vip.A2rd = 0;
			vip.B2rd = 0;

			vip.b2ld = 0; // 55 lc left door
			vip.a2ld = 0;
			vip.A2ld = 0;
			vip.B2ld = 0;

			vip.a1bo = 0; // 66 ld bottom
			vip.b1bo = 0;
			vip.A1bo = 0;
			vip.B1bo = 0;

			vip.b2t = 0; // 48 lc top
			vip.a2t = 0;
			vip.A2t = 0;
			vip.B2t = 0;
			System.out.println("aa>=(s1+s2+s3+s4) && aa<(s1+s2+s3+s4+s5)");

		} else if (aa >= (s1 + s2 + s3 + s4 + s5)&& aa < (s1 + s2 + s3 + s4 + s5 + s6)) {
			vip.areaShengYu = (aa-s1-s2-s3-s4-s5)*pow6;
			vip.areaTuiJian = (s1 + s2+ s3+ s4+ s5)*pow6;
			// 64 h1ldown
			double a = vip.a1ldown, b = vip.b1ldown, h = vip.h1ldown, w = vip.w1ldown;

			int x = 0, y = 0;
			Nsum = Nsum - N64;
			Qsum = Qsum - Q64;
			Tsum = Tsum - T64;
			Wsum = Wsum - W64;
			for (int i = (int) a; (aa - s1 - s2 - s3 - s4 - s5) / i <= b; i--) {

				N64 =  ((i-4*H64*pow33)*((aa - s1 - s2 - s3 - s4 - s5) / i -4*H64*pow33)*pow6*L64)*(1/(J64*(1./10+1./5+H64/I64+(K64-H64)/(C8*D64))))+(E64-(i-4*H64*pow33)*((aa - s1 - s2 - s3 - s4 - s5) / i -4*H64*pow33)*pow6)*L64*(1/(1./10+1./5+K64/(D64*C8)));
				if (sss >= N64) {
					sss = N64;
					x = i;
					y = (int) (aa - s1 - s2 - s3 - s4 - s5) / i;
				}

			}
			N64 = sss;
			F64 = x;
			G64 = y;
			Q64 =  ((F64-4*H64*pow33)*(G64-4*H64*pow33)*pow6*O64)*(1/(J64*(1./10+1./5+H64/I64+(K64-H64)/(D64))))+(E64-(F64-4*H64*pow33)*(G64-4*H64*pow33)*pow6)*O64*(1/(1./10+1./5+K64/(D64)));
			T64 = ((F64-4*H64*pow33)*(G64-4*H64*pow33)*pow6*R64)*(1/(J64*(1./10+1./5+H64/(I64*E9)+(K64-H64)/(E8*D64))))+(E64-(F64-4*H64*pow33)*(G64-4*H64*pow33)*pow6)*R64*(1/(1./10+1./5+K64/(D64*E8)));
			W64 = ((F64-4*H64*pow33)*(G64-4*H64*pow33)*pow6*U64)*(1/(J64*(1./10+1./5+H64/(I64*F9)+(K64-H64)/(F8*D64))))+(E64-(F64-4*H64*pow33)*(G64-4*H64*pow33)*pow6)*U64*(1/(1./10+1./5+K64/(D64*F8)));
			Nsum = Nsum + N64;
			Qsum = Qsum + Q64;
			Tsum = Tsum + T64;
			Wsum = Wsum + W64;
			vip.a1ldown = x;
			vip.b1ldown = y;
			vip.A1ldown = (w - vip.a1ldown) / 2;
			vip.B1ldown = (h - vip.b1ldown) / 2;

			vip.b2bsmall = 0; // 52
			vip.a2bsmall = 0;
			vip.A2bsmall = 0;
			vip.B2bsmall = 0;

			vip.a1rdown = 0; // 65 ld right down ¿‰∂≥ “ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“ ”“
			vip.b1rdown = 0;
			vip.A1rdown = 0;
			vip.B1rdown = 0;

			vip.b2l = 0; // 49 lc left
			vip.a2l = 0;
			vip.A2l = 0;
			vip.B2l = 0;

			vip.b2r = 0; // 50 lc right
			vip.a2r = 0;
			vip.A2r = 0;
			vip.B2r = 0;

			vip.b1rd = 0; // 70 ld right door ¿‰∂≥ “
			vip.a1rd = 0;
			vip.A1rd = 0;
			vip.B1rd = 0;

			vip.b1ld = 0; // 71 ld left door ¿‰∂≥ “
			vip.a1ld = 0;
			vip.A1ld = 0;
			vip.B1ld = 0;

			vip.b2rd = 0; // 54 lc right door
			vip.a2rd = 0;
			vip.A2rd = 0;
			vip.B2rd = 0;

			vip.b2ld = 0; // 55 lc left door
			vip.a2ld = 0;
			vip.A2ld = 0;
			vip.B2ld = 0;

			vip.b2t = 0; // 48 lc top
			vip.a2t = 0;
			vip.A2t = 0;
			vip.B2t = 0;

			vip.a1bo = 0; // 66 ld bottom
			vip.b1bo = 0;
			vip.A1bo = 0;
			vip.B1bo = 0;
			System.out.println(" (s1 + s2 + s3 + s4 + s5) < aa < (s1 + s2 + s3 + s4 + s5 + s6)");
		} else if (aa >= (s1 + s2 + s3 + s4 + s5 + s6)	&& aa < (s1 + s2 + s3 + s4 + s5 + s6 + s7)) {
			// 65 h1rdown
			vip.areaShengYu = (aa-s1-s2-s3-s4-s5-s6)*pow6;
			vip.areaTuiJian = (s1 + s2+ s3+ s4+ s5+ s6)*pow6;
			double a = vip.a1rdown, b = vip.b1rdown, h = vip.h1rdown, w = vip.w1rdown;

			int x = 0, y = 0;
			Nsum = Nsum - N65;
			Qsum = Qsum - Q65;
			Tsum = Tsum - T65;
			Wsum = Wsum - W65;
			for (int i = (int) a; (aa - s1 - s2 - s3 - s4 - s5 - s6) / i <= b; i--) {
				N65 =  ((i-4*H65*pow33)*((aa - s1 - s2 - s3 - s4 - s5 - s6) / i-4*H65*pow33)*pow6*L65)*(1/(J65*(1./10+1./5+H65/I65+(K65-H65)/(C8*D65))))+(E65-(i-4*H65*pow33)*((aa - s1 - s2 - s3 - s4 - s5 - s6) / i-4*H65*pow33)*pow6)*L65*(1/(1./10+1./5+K65/(D65*C8)));
				System.out.println("N65="+N65);
				if (sss >= N65) {
					sss = N65;
					x = i;
					y = (int) (aa - s1 - s2 - s3 - s4 - s5 - s6) / i;
				}
			}
			N65 = sss;
			F65 = x;
			G65 = y;
			Q65 =  ((F65-4*H65*pow33)*(G65-4*H65*pow33)*pow6*O65)*(1/(J65*(1./10+1./5+H65/I65+(K65-H65)/(D65))))+(E65-(F65-4*H65*pow33)*(G65-4*H65*pow33)*pow6)*O65*(1/(1./10+1./5+K65/(D65)));
			T65 = ((F65-4*H65*pow33)*(G65-4*H65*pow33)*pow6*R65)*(1/(J65*(1./10+1./5+H65/(I65*E9)+(K65-H65)/(E8*D65))))+(E65-(F65-4*H65*pow33)*(G65-4*H65*pow33)*pow6)*R65*(1/(1./10+1./5+K65/(D65*E8)));
			W65 = ((F65-4*H65*pow33)*(G65-4*H65*pow33)*pow6*U65)*(1/(J65*(1./10+1./5+H65/(I65*F9)+(K65-H65)/(F8*D65))))+(E65-(F65-4*H65*pow33)*(G65-4*H65*pow33)*pow6)*U65*(1/(1./10+1./5+K65/(D65*F8)));
			Nsum = Nsum + N65;
			Qsum = Qsum + Q65;
			Tsum = Tsum + T65;
			Wsum = Wsum + W65;
			vip.a1rdown = x;
			vip.b1rdown = y;
			vip.A1rdown = (w - vip.a1rdown) / 2;
			vip.B1rdown = (h - vip.b1rdown) / 2;

			vip.b2bsmall = 0; // 52
			vip.a2bsmall = 0;
			vip.A2bsmall = 0;
			vip.B2bsmall = 0;

			vip.b2l = 0; // 49 lc left
			vip.a2l = 0;
			vip.A2l = 0;
			vip.B2l = 0;

			vip.b2r = 0; // 50 lc right
			vip.a2r = 0;
			vip.A2r = 0;
			vip.B2r = 0;

			vip.b1rd = 0; // 70 ld right door ¿‰∂≥ “
			vip.a1rd = 0;
			vip.A1rd = 0;
			vip.B1rd = 0;

			vip.b1ld = 0; // 71 ld left door ¿‰∂≥ “
			vip.a1ld = 0;
			vip.A1ld = 0;
			vip.B1ld = 0;

			vip.b2rd = 0; // 54 lc right door
			vip.a2rd = 0;
			vip.A2rd = 0;
			vip.B2rd = 0;

			vip.b2ld = 0; // 55 lc left door
			vip.a2ld = 0;
			vip.A2ld = 0;
			vip.B2ld = 0;

			vip.b2t = 0; // 48 lc top
			vip.a2t = 0;
			vip.A2t = 0;
			vip.B2t = 0;

			vip.a1bo = 0; // 66 ld bottom
			vip.b1bo = 0;
			vip.A1bo = 0;
			vip.B1bo = 0;
			System.out.println("(s1 + s2 + s3 + s4 + s5+ s6) < aa < (s1 + s2 + s3 + s4 + s5 + s6+ s7)");
		} else if (aa >= (s1 + s2 + s3 + s4 + s5 + s6 + s7)	&& aa < (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8)) {
			// 49 h2l
			vip.areaShengYu = (aa-s1-s2-s3-s4-s5-s6-s7)*pow6;
			vip.areaTuiJian = (s1 + s2+ s3+ s4+ s5+ s6 + s7)*pow6;
			double a = vip.a2l, b = vip.b2l, h = vip.h2l, w = vip.w2l;

			int x = 0, y = 0;
			Nsum = Nsum - N49;
			Qsum = Qsum - Q49;
			Tsum = Tsum - T49;
			Wsum = Wsum - W49;
			for (int i = (int) a; (aa - s1 - s2 - s3 - s4 - s5 - s6 - s7) / i <= b; i--) {
				N49 =  ((i-4*H49*pow33)*((aa - s1 - s2 - s3 - s4 - s5 - s6 - s7) / i-4*H49*pow33)*pow6*L49)*(1/(J49*(1./10+1./5+H49/I49+(K49-H49)/(C8*D49))))+(E49-(i-4*H49*pow33)*((aa - s1 - s2 - s3 - s4 - s5 - s6 - s7) / i-4*H49*pow33)*pow6)*L49*(1/(1./10+1./5+K49/(D49*C8)));

				if (sss >= N49) {
					sss = N49;
					x = i;
					y = (int) (aa - s1 - s2 - s3 - s4 - s5 - s6 - s7) / i;
				}

			}
			N49 = sss;
			F49 = x;
			G49 = y;
			Q49 =  ((F49-4*H49*pow33)*(G49-4*H49*pow33)*pow6*O49)*(1/(J49*(1./10+1./5+H49/I49+(K49-H49)/(D49))))+(E49-(F49-4*H49*pow33)*(G49-4*H49*pow33)*pow6)*O49*(1/(1./10+1./5+K49/(D49)));
			T49 = ((F49-4*H49*pow33)*(G49-4*H49*pow33)*pow6*R49)*(1/(J49*(1./10+1./5+H49/(I49*E9)+(K49-H49)/(E8*D49))))+(E49-(F49-4*H49*pow33)*(G49-4*H49*pow33)*pow6)*R49*(1/(1./10+1./5+K49/(D49*E8)));
			W49 = ((F49-4*H49*pow33)*(G49-4*H49*pow33)*pow6*U49)*(1/(J49*(1./10+1./5+H49/(I49*F9)+(K49-H49)/(F8*D49))))+(E49-(F49-4*H49*pow33)*(G49-4*H49*pow33)*pow6)*U49*(1/(1./10+1./5+K49/(D49*F8)));
			Qsum = Qsum + Q49;
			Nsum = Nsum + N49;
			Tsum = Tsum + T49;
			Wsum = Wsum + W49;
			vip.a2l = x;
			vip.b2l = y;
			vip.A2l = (w - vip.a2l) / 2;
			vip.B2l = (h - vip.b2l) / 2;

			vip.b2bsmall = 0; // 52
			vip.a2bsmall = 0;
			vip.A2bsmall = 0;
			vip.B2bsmall = 0;

			vip.b2r = 0; // 50 lc right
			vip.a2r = 0;
			vip.A2r = 0;
			vip.B2r = 0;

			vip.b1rd = 0; // 70 ld right door ¿‰∂≥ “
			vip.a1rd = 0;
			vip.A1rd = 0;
			vip.B1rd = 0;

			vip.b1ld = 0; // 71 ld left door ¿‰∂≥ “
			vip.a1ld = 0;
			vip.A1ld = 0;
			vip.B1ld = 0;

			vip.b2rd = 0; // 54 lc right door
			vip.a2rd = 0;
			vip.A2rd = 0;
			vip.B2rd = 0;

			vip.b2ld = 0; // 55 lc left door
			vip.a2ld = 0;
			vip.A2ld = 0;
			vip.B2ld = 0;

			vip.b2t = 0; // 48 lc top
			vip.a2t = 0;
			vip.A2t = 0;
			vip.B2t = 0;

			vip.a1bo = 0; // 66 ld bottom
			vip.b1bo = 0;
			vip.A1bo = 0;
			vip.B1bo = 0;
			System.out.println("(s1 + s2 + s3 + s4 + s5+ s6 + s7)< aa < (s1 + s2 + s3 + s4 + s5 + s6+ s7 + s8)");
		} else if (aa >= (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8)&& aa < (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9)) {
			// 50 h2r
			vip.areaShengYu = (aa-s1-s2-s3-s4-s5-s6-s7-s8)*pow6;
			vip.areaTuiJian = (s1 + s2+ s3+ s4+ s5+ s6+s7+s8)*pow6;
			double a = vip.a2r, b = vip.b2r, h = vip.h2r, w = vip.w2r;

			int x = 0, y = 0;
			Nsum = Nsum - N50;
			Qsum = Qsum - Q50;
			Tsum = Tsum - T50;
			Wsum = Wsum - W50;
			for (int i = (int) a; (aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8)/ i <= b; i--) {
				N50 =  ((i-4*H50*pow33)*((aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8) / i-4*H50*pow33)*pow6*L50)*(1/(J50*(1./10+1./5+H50/I50+(K50-H50)/(C8*D50))))+(E50-(i-4*H50*pow33)*((aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8) / i-4*H50*pow33)*pow6)*L50*(1/(1./10+1./5+K50/(D50*C8)));
				if (sss >= N50) {
					sss = N50;
					x = i;
					y = (int) (aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8) / i;
				}
			}
			N50 = sss;
			F50 = x;
			G50 = y;
			Q50 =   ((F50-4*H50*pow33)*(G50-4*H50*pow33)*pow6*O50)*(1/(J50*(1./10+1./5+H50/I50+(K50-H50)/(D50))))+(E50-(F50-4*H50*pow33)*(G50-4*H50*pow33)*pow6)*O50*(1/(1./10+1./5+K50/(D50)));
			T50 = ((F50-4*H50*pow33)*(G50-4*H50*pow33)*pow6*R50)*(1/(J50*(1./10+1./5+H50/(I50*E9)+(K50-H50)/(E8*D50))))+(E50-(F50-4*H50*pow33)*(G50-4*H50*pow33)*pow6)*R50*(1/(1./10+1./5+K50/(D50*E8)));
			W50 = ((F50-4*H50*pow33)*(G50-4*H50*pow33)*pow6*U50)*(1/(J50*(1./10+1./5+H50/(I50*F9)+(K50-H50)/(F8*D50))))+(E50-(F50-4*H50*pow33)*(G50-4*H50*pow33)*pow6)*U50*(1/(1./10+1./5+K50/(D50*F8)));
			Qsum = Qsum + Q50;
			Nsum = Nsum + N50;
			Tsum = Tsum + T50;
			Wsum = Wsum + W50;
			vip.a2r = x;
			vip.b2r = y;
			vip.A2r = (w - vip.a2r) / 2;
			vip.B2r = (h - vip.b2r) / 2;

			vip.b2bsmall = 0; // 52
			vip.a2bsmall = 0;
			vip.A2bsmall = 0;
			vip.B2bsmall = 0;

			vip.b1rd = 0; // 70 ld right door ¿‰∂≥ “
			vip.a1rd = 0;
			vip.A1rd = 0;
			vip.B1rd = 0;

			vip.b1ld = 0; // 71 ld left door ¿‰∂≥ “
			vip.a1ld = 0;
			vip.A1ld = 0;
			vip.B1ld = 0;

			vip.b2rd = 0; // 54 lc right door
			vip.a2rd = 0;
			vip.A2rd = 0;
			vip.B2rd = 0;

			vip.b2ld = 0; // 55 lc left door
			vip.a2ld = 0;
			vip.A2ld = 0;
			vip.B2ld = 0;

			vip.b2t = 0; // 48 lc top
			vip.a2t = 0;
			vip.A2t = 0;
			vip.B2t = 0;

			vip.a1bo = 0; // 66 ld bottom
			vip.b1bo = 0;
			vip.A1bo = 0;
			vip.B1bo = 0;
			System.out.println("(s1 + s2 + s3 + s4 + s5+ s6 + s7 + s8) < aa < (s1 + s2 + s3 + s4 + s5 + s6+ s7+ s8 + s9)");
		} else if (aa >= (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9)&& aa < (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10)) {
			// 70 h1rd
			vip.areaShengYu = (aa-s1-s2-s3-s4-s5-s6-s7-s8-s9)*pow6;
			vip.areaTuiJian = (s1 + s2+ s3+ s4+ s5+ s6+s7+s8+s9)*pow6;
			double a = vip.a1rd, b = vip.b1rd, h = vip.h1rd, w = vip.w1rd;

			int x = 0, y = 0;
			Nsum = Nsum - N70;
			Qsum = Qsum - Q70;
			Tsum = Tsum - T70;
			Wsum = Wsum - W70;
			for (int i = (int) a; (aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8 - s9)/ i <= b; i--) {
				N70 =  ((i-4*H70*pow33)*((aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8 - s9)/ i-4*H70*pow33)*pow6*L70)*(1/(J70*(1./10+1./5+H70/I70+(K70-H70)/(C8*D70))))+(E70-(i-4*H70*pow33)*((aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8 - s9)/ i-4*H70*pow33)*pow6)*L70*(1/(1./10+1./5+K70/(D70*C8)));
				if (sss >= N70) {
					sss = N70;
					x = i;
					y = (int) (aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8 - s9)	/ i;
				}

			}
			N70 = sss;
			F70 = x;
			G70 = y;
			Q70 = ((F70-4*H70*pow33)*(G70-4*H70*pow33)*pow6*O70)*(1/(J70*(1./10+1./5+H70/I70+(K70-H70)/(D70))))+(E70-(F70-4*H70*pow33)*(G70-4*H70*pow33)*pow6)*O70*(1/(1./10+1./5+K70/(D70)));
			T70 = ((F70-4*H70*pow33)*(G70-4*H70*pow33)*pow6*R70)*(1/(J70*(1./10+1./5+H70/I70+(K70-H70)/(E8*D70))))+(E70-(F70-4*H70*pow33)*(G70-4*H70*pow33)*pow6)*R70*(1/(1./10+1./5+K70/(D70*E8)));
			W70 = ((F70-4*H70*pow33)*(G70-4*H70*pow33)*pow6*U70)*(1/(J70*(1./10+1./5+H70/(I70*F9)+(K70-H70)/(F8*D70))))+(E70-(F70-4*H70*pow33)*(G70-4*H70*pow33)*pow6)*U70*(1/(1./10+1./5+K70/(D70*F8)));
			Qsum = Qsum + Q70;
			Nsum = Nsum + N70;
			Tsum = Tsum + T70;
			Wsum = Wsum + W70;
			vip.a1rd = x;
			vip.b1rd = y;
			vip.A1rd = (w - vip.a1rd) / 2;
			vip.B1rd = (h - vip.b1rd) / 2;

			vip.b2bsmall = 0; // 52
			vip.a2bsmall = 0;
			vip.A2bsmall = 0;
			vip.B2bsmall = 0;

			vip.b1ld = 0; // 71 ld left door ¿‰∂≥ “
			vip.a1ld = 0;
			vip.A1ld = 0;
			vip.B1ld = 0;

			vip.b2rd = 0; // 54 lc right door
			vip.a2rd = 0;
			vip.A2rd = 0;
			vip.B2rd = 0;

			vip.b2ld = 0; // 55 lc left door
			vip.a2ld = 0;
			vip.A2ld = 0;
			vip.B2ld = 0;

			vip.b2t = 0; // 48 lc top
			vip.a2t = 0;
			vip.A2t = 0;
			vip.B2t = 0;

			vip.a1bo = 0; // 66 ld bottom
			vip.b1bo = 0;
			vip.A1bo = 0;
			vip.B1bo = 0;
			System.out.println("(s1 + s2 + s3 + s4 + s5+ s6 + s7+ s8 + s9)  < aa < (s1 + s2 + s3 + s4 + s5 + s6+ s7 +s8 + s9 +s10)");
		} else if (aa >= (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10)	&& aa < (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11)) {
			// 71 h1ld
			vip.areaShengYu = (aa-s1-s2-s3-s4-s5-s6-s7-s8-s9-s10)*pow6;
			vip.areaTuiJian = (s1 + s2+ s3+ s4+ s5+ s6+s7+s8+s9+s10)*pow6;
			double a = vip.a1ld, b = vip.b1ld, h = vip.h1ld, w = vip.w1ld;

			int x = 0, y = 0;
			Nsum = Nsum - N71;
			Qsum = Qsum - Q71;
			Tsum = Tsum - T71;
			Wsum = Wsum - W71;
			for (int i = (int) a; (aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8- s9 - s10)/ i <= b; i--) {
				N71 =  ((i-4*H71*pow33)*((aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8- s9 - s10)/ i-4*H71*pow33)*pow6*L71)*(1/(J71*(1./10+1./5+H71/I71+(K71-H71)/(C8*D71))))+(E71-(i-4*H71*pow33)*((aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8- s9 - s10)/ i-4*H71*pow33)*pow6)*L71*(1/(1./10+1./5+K71/(D71*C8)));
				if (sss >= N71) {
					sss = N71;
					x = i;
					y = (int) (aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8 - s9 - s10)/ i;
				}
			}
			N71 = sss;
			F71 = x;
			G71 = y;
			Q71 =  ((F71-4*H71*pow33)*(G71-4*H71*pow33)*pow6*O71)*(1/(1./10+1./5+H71/I71+(K71-H71)/(D71)))+(E71-(F71-4*H71*pow33)*(G71-4*H71*pow33)*pow6)*O71*(1/(1./10+1./5+K71/(D71)));
			T71 = ((F71-4*H71*pow33)*(G71-4*H71*pow33)*pow6*R71)*(1/(J71*(1./10+1./5+H71/(I71*E9)+(K71-H71)/(E8*D71))))+(E71-(F71-4*H71*pow33)*(G71-4*H71*pow33)*pow6)*R71*(1/(1./10+1./5+K71/(D71*E8)));
			W71 = ((F71-4*H71*pow33)*(G71-4*H71*pow33)*pow6*U71)*(1/(J71*(1./10+1./5+H71/(I71*F9)+(K71-H71)/(F8*D71))))+(E71-(F71-4*H71*pow33)*(G71-4*H71*pow33)*pow6)*U71*(1/(1./10+1./5+K71/(D71*F8)));
			Qsum = Qsum + Q71;
			Nsum = Nsum + N71;
			Tsum = Tsum + T71;
			Wsum = Wsum + W71;
			vip.a1ld = x;
			vip.b1ld = y;
			vip.A1ld = (w - vip.a1ld) / 2;
			vip.B1ld = (h - vip.b1ld) / 2;

			vip.b2bsmall = 0; // 52
			vip.a2bsmall = 0;
			vip.A2bsmall = 0;
			vip.B2bsmall = 0;

			vip.b2rd = 0; // 54 lc right door
			vip.a2rd = 0;
			vip.A2rd = 0;
			vip.B2rd = 0;

			vip.b2ld = 0; // 55 lc left door
			vip.a2ld = 0;
			vip.A2ld = 0;
			vip.B2ld = 0;

			vip.b2t = 0; // 48 lc top
			vip.a2t = 0;
			vip.A2t = 0;
			vip.B2t = 0;

			vip.a1bo = 0; // 66 ld bottom
			vip.b1bo = 0;
			vip.A1bo = 0;
			vip.B1bo = 0;
			System.out.println("(s1 + s2 + s3 + s4 + s5+ s6 + s7 +s8 + s9 +s10) < aa < (s1 + s2 + s3 + s4 + s5 + s6+ s7  +s8 + s9 +s10 +s11)");
		} else if (aa >= (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11)
				&& aa < (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11 + 12)) {
			// 54 h2rd
			vip.areaShengYu = (aa-s1-s2-s3-s4-s5-s6-s7-s8-s9-s10-s11)*pow6;
			vip.areaTuiJian = (s1 + s2+ s3+ s4+ s5+ s6+s7+s8+s9+s10+s11)*pow6;
			double a = vip.a2rd, b = vip.b2rd, h = vip.h2rd, w = vip.w2rd;

			int x = 0, y = 0;
			Nsum = Nsum - N54;
			Qsum = Qsum - Q54;
			Tsum = Tsum - T54;
			Wsum = Wsum - W54;
			for (int i = (int) a; (aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8- s9 - s10 - s11)/ i <= b; i--) {

				N54 =  ((i-4*H54*pow33)*((aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8- s9 - s10 - s11)/ i-4*H54*pow33)*pow6*L54)*(1/(J54*(1./10+1./5+H54/I54+(K54-H54)/(C8*D54))))+(E54-(i-4*H54*pow33)*((aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8- s9 - s10 - s11)/ i-4*H54*pow33)*pow6)*L54*(1/(1./10+1./5+K54/(D54*C8)));
				if (sss >= N54) {
					sss = N54;
					x = i;
					y = (int) (aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8 - s9- s10 - s11)/ i;
				}
			}
			N54 = sss;
			F54 = x;
			G54 = y;
			Q54 =  ((F54-4*H54*pow33)*(G54-4*H54*pow33)*pow6*O54)*(1/(J54*(1./10+1./5+H54/I54+(K54-H54)/(D54))))+(E54-(F54-4*H54*pow33)*(G54-4*H54*pow33)*pow6)*O54*(1/(1./10+1./5+K54/(D54)));
			T54 = ((F54-4*H54*pow33)*(G54-4*H54*pow33)*pow6*R54)*(1/(J54*(1./10+1./5+H54/(I54*E9)+(K54-H54)/(E8*D54))))+(E54-(F54-4*H54*pow33)*(G54-4*H54*pow33)*pow6)*R54*(1/(1./10+1./5+K54/(D54*E8)));
			W54 = ((F54-4*H54*pow33)*(G54-4*H54*pow33)*pow6*U54)*(1/(J54*(1./10+1./5+H54/(I54*F9)+(K54-H54)/(F8*D54))))+(E54-(F54-4*H54*pow33)*(G54-4*H54*pow33)*pow6)*U54*(1/(1./10+1./5+K54/(D54*F8)));
			Qsum = Qsum + Q54;
			Nsum = Nsum + N54;
			Tsum = Tsum + T54;
			Wsum = Wsum + W54;
			vip.a2rd = x;
			vip.b2rd = y;
			vip.A2rd = (w - vip.a2rd) / 2;
			vip.B2rd = (h - vip.b2rd) / 2;

			vip.b2bsmall = 0; // 52
			vip.a2bsmall = 0;
			vip.A2bsmall = 0;
			vip.B2bsmall = 0;

			vip.b2ld = 0; // 55 lc left door
			vip.a2ld = 0;
			vip.A2ld = 0;
			vip.B2ld = 0;

			vip.b2t = 0; // 48 lc top
			vip.a2t = 0;
			vip.A2t = 0;
			vip.B2t = 0;

			vip.a1bo = 0; // 66 ld bottom
			vip.b1bo = 0;
			vip.A1bo = 0;
			vip.B1bo = 0;
			System.out.println("(s1 + s2 + s3 + s4 + s5+ s6 + s7  +s8 + s9 +s10 +s11)  && aa < (s1 + s2 + s3 + s4 + s5 + s6+ s7 +s8 + s9 +s10 +s11 +12)");
		} else if (aa >= (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10	+ s11 + s12)&& aa < (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11	+ s12 + s13)) {
			// 55 h2ld
			vip.areaShengYu = (aa-s1-s2-s3-s4-s5-s6-s7-s8-s9-s10-s11-s12)*pow6;
			vip.areaTuiJian = (s1 + s2+ s3+ s4+ s5+ s6+s7+s8+s9+s10+s11+s12)*pow6;

			double a = vip.a2ld, b = vip.b2ld, h = vip.h2ld, w = vip.w2ld;

			int x = 0, y = 0;
			Nsum = Nsum - N55;
			Qsum = Qsum - Q55;
			Tsum = Tsum - T55;
			Wsum = Wsum - W55;
			for (int i = (int) a; (aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8- s9 - s10 - s11 - s12)/ i <= b; i--) {

				N55 =  ((i-4*H55*pow33)*((aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8- s9 - s10 - s11 - s12)/ i-4*H55*pow33)*pow6*L55)*(1/(J55*(1./10+1./5+H55/I55+(K55-H55)/(C8*D55))))+(E55-(i-4*H55*pow33)*((aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8- s9 - s10 - s11 - s12)/ i-4*H55*pow33)*pow6)*L55*(1/(1./10+1./5+K55/(D55*C8)));
				if (sss >= N55) {
					sss = N55;
					x = i;
					y = (int) (aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8 - s9	- s10 - s11 - s12)	/ i;
				}

			}
			N55 = sss;
			F55 = x;
			G55 = y;
			Q55 =  ((F55-4*H55*pow33)*(G55-4*H55*pow33)*pow6*O55)*(1/(J55*(1./10+1./5+H55/I55+(K55-H55)/(D55))))+(E55-(F55-4*H55*pow33)*(G55-4*H55*pow33)*pow6)*O55*(1/(1./10+1./5+K55/(D55)));
			T55 = ((F55-4*H55*pow33)*(G55-4*H55*pow33)*pow6*R55)*(1/(1./10+1./5+H55/(I55*E9)+(K55-H55)/(E8*D55)))+(E55-(F55-4*H55*pow33)*(G55-4*H55*pow33)*pow6)*R55*(1/(1./10+1./5+K55/(D55*E8)));
			W55 = ((F55-4*H55*pow33)*(G55-4*H55*pow33)*pow6*U55)*(1/(J55*(1./10+1./5+H55/(I55*F9)+(K55-H55)/(F8*D55))))+(E55-(F55-4*H55*pow33)*(G55-4*H55*pow33)*pow6)*U55*(1/(1./10+1./5+K55/(D55*F8)));
			Qsum = Qsum + Q55;
			Nsum = Nsum + N55;
			Tsum = Tsum + T55;
			Wsum = Wsum + W55;
			vip.a2ld = x;
			vip.b2ld = y;
			vip.A2ld = (w - vip.a2ld) / 2;
			vip.B2ld = (h - vip.b2ld) / 2;

			vip.b2bsmall = 0; // 52
			vip.a2bsmall = 0;
			vip.A2bsmall = 0;
			vip.B2bsmall = 0;

			vip.b2t = 0; // 48 lc top
			vip.a2t = 0;
			vip.A2t = 0;
			vip.B2t = 0;

			vip.a1bo = 0; // 66 ld bottom
			vip.b1bo = 0;
			vip.A1bo = 0;
			vip.B1bo = 0;
			System.out.println(" (s1 + s2 + s3 + s4 + s5+ s6 + s7  +s8 + s9 +s10 +s11 +s12)  && aa < (s1 + s2 + s3 + s4 + s5 + s6+ s7 +s8 + s9 +s10 +s11 +s12 +s13)");
		} else if (aa >= (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10	+ s11 + s12 + s13)
				&& aa < (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11	+ s12 + s13 + s14)) {
			// 48 h2t
			vip.areaShengYu = (aa-s1-s2-s3-s4-s5-s6-s7-s8-s9-s10-s11-s12-s13)*pow6;
			vip.areaTuiJian = (s1 + s2+ s3+ s4+ s5+ s6+s7+s8+s9+s10+s11+s12+s13)*pow6;

			double a = vip.a2t, b = vip.b2t, h = vip.h2t, w = vip.w2t;

			int x = 0, y = 0;
			Nsum = Nsum - N48;
			Qsum = Qsum - Q48;
			Tsum = Tsum - T48;
			Wsum = Wsum - W48;
			for (int i = (int) a; (aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8 - s9 - s10 - s11 - s12 - s13)	/ i <= b; i--) {
//				System.out.println("xunhuan up N48"+N48);
				N48 =  ((i-4*H48*pow33)*((aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8 - s9 - s10 - s11 - s12 - s13)	/ i-4*H48*pow33)*pow6*L48)*(1./(J48*(1./10+1./5+H48/I48+(K48-H48)/(C8*D48))))+(E48-(i-4*H48*pow33)*((aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8 - s9 - s10 - s11 - s12 - s13)	/ i-4*H48*pow33)*pow6)*L48*(1./(1./10+1./5+K48/(D48*C8)));
//				System.out.println("xunhuan down N48"+N48);
				if (sss >= N48) {
					sss = N48;
					x = i;
					y = (int) (aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8 - s9- s10 - s11 - s12 - s13)/ i;
				}
			}
			N48 = sss;
			F48 = x;
			G48 = y;
			Q48 =   ((F48-4*H48*pow33)*(G48-4*H48*pow33)*pow6*O48)*(1./(J48*(1./10+1./5+H48/I48+(K48-H48)/(D48))))+(E48-(F48-4*H48*pow33)*(G48-4*H48*pow33)*pow6)*O48*(1./(1./10+1./5+K48/(D48)));
			T48 = ((F48-4*H48*pow33)*(G48-4*H48*pow33)*pow6*R48)*(1/(J48*(1./10+1./5+H48/(I48*E9)+(K48-H48)/(E8*D48))))+(E48-(F48-4*H48*pow33)*(G48-4*H48*pow33)*pow6)*R48*(1/(1./10+1./5+K48/(D48*E8)));
			W48=  ((F48-4*H48*pow33)*(G48-4*H48*pow33)*pow6*U48)*(1/(J48*(1./10+1./5+H48/(I48*F9)+(K48-H48)/(F8*D48))))+(E48-(F48-4*H48*pow33)*(G48-4*H48*pow33)*pow6)*U48*(1/(1./10+1./5+K48/(D48*F8)));
			Qsum = Qsum + Q48;
			Nsum = Nsum + N48;
			Tsum = Tsum + T48;
			Wsum = Wsum + W48;
			vip.a2t = x;
			vip.b2t = y;
			vip.A2t = (w - vip.a2t) / 2;
			vip.B2t = (h - vip.b2t) / 2;

			vip.b2bsmall = 0; // 52
			vip.a2bsmall = 0;
			vip.A2bsmall = 0;
			vip.B2bsmall = 0;

			vip.a1bo = 0; // 66 ld bottom
			vip.b1bo = 0;
			vip.A1bo = 0;
			vip.B1bo = 0;
			System.out.println("(s1 + s2 + s3 + s4 + s5+ s6 + s7  +s8 + s9 +s10 +s11 +s12 +s13)  && aa < (s1 + s2 + s3 + s4 + s5 + s6+ s7 +s8 + s9 +s10 +s11 +12 +s13 +s14)");
		} else if (aa >= (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10+ s11 + s12 + s13 + s14)
				&& aa < (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10 + s11	+ s12 + s13 + s14 + s15)) {
			// 66 h1bo
			vip.areaShengYu = (aa-s1-s2-s3-s4-s5-s6-s7-s8-s9-s10-s11-s12-s13-s14)*pow6;
			vip.areaTuiJian = (s1 + s2+ s3+ s4+ s5+ s6+s7+s8+s9+s10+s11+s12+s13+s14)*pow6;

			double a = vip.a1bo, b = vip.b1bo, h = vip.h1bo, w = vip.w1bo;

			int x = 0, y = 0;
			Nsum = Nsum - N66;
			Qsum = Qsum - Q66;
			Tsum = Tsum - T66;
			Wsum = Wsum - W66;
			for (int i = (int) a; (aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8- s9 - s10 - s11 - s12 - s13 - s14)/ i <= b; i--) {
				N66 = ((i-4*H66*pow33)*((aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8- s9 - s10 - s11 - s12 - s13 - s14)/ i-4*H66*pow33)*pow6*L66)*(1/(J66*(1./10+1./5+H66/I66+(K66-H66)/(C8*D66))))+(E66-(i-4*H66*pow33)*((aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8- s9 - s10 - s11 - s12 - s13 - s14)/ i-4*H66*pow33)*pow6)*L66*(1/(1./10+1./5+K66/(D66*C8)));
				if (sss >= N66) {
					sss = N66;
					x = i;
					y = (int) (aa - s1 - s2 - s3 - s4 - s5 - s6 - s7 - s8 - s9- s10 - s11 - s12 - s13 - s14)/ i;
				}
			}
			N66 = sss;
			F66 = x;
			G66 = y;
			Q66 =   ((F66-4*H66*pow33)*(G66-4*H66*pow33)*pow6*O66)*(1/(J66*(1./10+1./5+H66/I66+(K66-H66)/(D66))))+(E66-(F66-4*H66*pow33)*(G66-4*H66*pow33)*pow6)*O66*(1/(1./10+1./5+K66/(D66)));
			T66 = ((F66-4*H66*pow33)*(G66-4*H66*pow33)*pow6*R66)*(1/(J66*(1./10+1./5+H66/(I66*E9)+(K66-H66)/(E8*D66))))+(E66-(F66-4*H66*pow33)*(G66-4*H66*pow33)*pow6)*R66*(1/(1./10+1./5+K66/(D66*E8)));
			W66 = ((F66-4*H66*pow33)*(G66-4*H66*pow33)*pow6*U66)*(1/(J66*(1./10+1./5+H66/(I66*F9)+(K66-H66)/(F8*D66))))+(E66-(F66-4*H66*pow33)*(G66-4*H66*pow33)*pow6)*U66*(1/(1./10+1./5+K66/(D66*F8)));
			Qsum = Qsum + Q66;
			Nsum = Nsum + N66;
			Tsum = Tsum + T66;
			Wsum = Wsum + W66;
			vip.a1bo = x;
			vip.b1bo = y;
			vip.A1bo = (w - vip.a1bo) / 2;
			vip.B1bo = (h - vip.b1bo) / 2;

			vip.b2bsmall = 0; // 52
			vip.a2bsmall = 0;
			vip.A2bsmall = 0;
			vip.B2bsmall = 0;

			System.out.println(" (s1 + s2 + s3 + s4 + s5+ s6 + s7  +s8 + s9 +s10 +s11 +s12 +s13 +s14) < aa < (s1 + s2 + s3 + s4 + s5 + s6+ s7 +s8 + s9 +s10 +s11 +s12 +s13 +s14  +s15 )");
		} else if (aa >= (s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10+ s11 + s12 + s13 + s14 + s15)) {
			System.out.println("aa >= (s1 + s2 + s3 + s4 + s5+ s6 + s7 +s8 + s9 +s10 +s11 +s12 +s13 +s14 +s15)");
			vip.areaShengYu = (aa-s1-s2-s3-s4-s5-s6-s7-s8-s9-s10-s11-s12-s13-s14-s15)*pow6;
			vip.areaTuiJian = (s1 + s2+ s3+ s4+ s5+ s6+s7+s8+s9+s10+s11+s12+s13+s14+s15)*pow6;
			vip.b2bsmall = 0; // 52
			vip.a2bsmall = 0;
			vip.A2bsmall = 0;
			vip.B2bsmall = 0;
		}

		vip.N77 = Nsum;// 32°Ê ”–VIP∞Âµƒ◊‹Q
		vip.N78 = (Msum - Nsum) / Msum * 100;
		vip.Q77 = Qsum;// 16°Ê ”–VIP∞Â◊‹Q
		vip.Q78 = (Psum - Qsum) / Psum * 100;
		vip.T77 = Tsum;// 38°Ê ”–VIP∞Â◊‹Q
		vip.T78 = (Ssum - Tsum) / Ssum * 100;
		vip.W77 = Wsum;// 43°Ê ”–VIP∞Â◊‹Q
		vip.W78 = (Vsum - Wsum) / Vsum * 100;
		System.out.println("32∂»  VIP–ßπ˚=" + (Msum - Nsum) / Msum * 100 + "%");
		// System.out.println("16∂»  VIP–ßπ˚="+(Psum-Qsum)/Psum*100+"%");

//		System.out.println("(M48-N48)"+(M48-N48));
//		System.out.println("(M49-N49)"+(M49-N49));
//		System.out.println("(M50-N50)"+(M50-N50));
//		System.out.println("(M51-N51)"+(M51-N51));
//		System.out.println("(M52-N52)"+(M52-N52));
//		System.out.println("(M53-N53)"+(M53-N53));
//		System.out.println("(M54-N54)"+(M54-N54));
//		System.out.println("(M55-N55)"+(M55-N55));
//		System.out.println("(M56-N56)"+(M56-N56));
//		System.out.println("(M57-N57)"+(M57-N57));
//		System.out.println("(M58-N58)"+(M58-N58));
//		System.out.println("(M59-N59)"+(M59-N59));
//		System.out.println("(M60-N60)"+(M60-N60));
//		System.out.println("(M61-N61)"+(M61-N61));
//		System.out.println("(M62-N62)"+(M62-N62));
//		System.out.println("(M63-N63)"+(M63-N63));
//		System.out.println("(M64-N64)"+(M64-N64));
//		System.out.println("(M65-N65)"+(M65-N65));
//		System.out.println("(M66-N66)"+(M66-N66));
//		System.out.println("(M67-N67)"+(M67-N67));
//		System.out.println("(M68-N68)"+(M68-N68));
//		System.out.println("(M69-N69)"+(M69-N69));
//		System.out.println("(M70-N70)"+(M70-N70));
//		System.out.println("(M71-N71)"+(M71-N71));
//		System.out.println("(M72-N72)"+(M72-N72));
//		System.out.println("(M73-N73)"+(M73-N73));
//		System.out.println("(M74-N74)"+(M74-N74));
//		System.out.println("(M75-N75)"+(M75-N75));
//		System.out.println("(M76-N76)"+(M76-N76));

//		 System.out.println("P48=="+M48);
//		 System.out.println("P49="+M49);
//		 System.out.println("P50="+M50);
//		 System.out.println("P51="+M51);
//		 System.out.println("P52="+M52);
//		 System.out.println("P53="+M53);
//		 System.out.println("P54="+M54);
//		 System.out.println("P55="+M55);
//		 System.out.println("P56="+M56);
//		 System.out.println("P57="+M57);
//		 System.out.println("P58="+M58);
//		 System.out.println("P59="+M59);
//		 System.out.println("P60="+M60);
//		 System.out.println("P61="+M61);
//		 System.out.println("M62="+M62+",L62="+L62+",E62="+E62+",K62="+K62+",C8="+C8+",D62="+D62);
//		 System.out.println("P63="+M63);
//		 System.out.println("P64="+M64);
//		 System.out.println("P65="+M65);
//		 System.out.println("P66="+M66);
//		 System.out.println("P67="+M67);
//		 System.out.println("P68="+M68);
//		 System.out.println("P69="+M69);
//		 System.out.println("P70="+M70);
//		 System.out.println("P71="+M71);
//		 System.out.println("P72="+M72);
//		 System.out.println("P73="+M73);
//		 System.out.println("P74="+M74);
//		 System.out.println("P75="+M75);
//		 System.out.println("P76="+M76);
		System.out.println("T48="+T48);
		System.out.println("T49="+T49);
		System.out.println("T50="+T50);
		System.out.println("T51="+T51);
		System.out.println("T52="+T52);
		System.out.println("T53="+T53);
		System.out.println("T54="+T54);
		System.out.println("T55="+T55);
		System.out.println("T56="+T56);
		System.out.println("T57="+T57);
		System.out.println("T58="+T58);
		System.out.println("T59="+T59);
		System.out.println("T60="+T60);
		System.out.println("T61="+T61);
		System.out.println("T62="+T62);
		System.out.println("T63="+T63);
		System.out.println("T64="+T64);
		System.out.println("T65="+T65);
		System.out.println("T66="+T66);
		System.out.println("T67="+T67);
		System.out.println("T68="+T68);
		System.out.println("T69="+T69);
		System.out.println("T70="+T70);
		System.out.println("T71="+T71);
		System.out.println("T72="+T72);
		System.out.println("T73="+T73);
		System.out.println("T74="+T74);
		System.out.println("T75="+T75);
		System.out.println("T76="+T76);
//		System.out.println("thick1 = "+vip.thickness1);
//		System.out.println("thick2 = "+vip.thickness2);
//		System.out.println("thick3 = "+vip.thickness3);
//		System.out.println("thick4 = "+vip.thickness4);
//		System.out.println("thick5 = "+vip.thickness5);
//		System.out.println("thick6 = "+vip.thickness6);
//		System.out.println("thick7 = "+vip.thickness7);
//		System.out.println("thick8 = "+vip.thickness8);
//		System.out.println("thick9 = "+vip.thickness9);
//		System.out.println("thick10 = "+vip.thickness10);
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {
		buttonGroup1 = new ButtonGroup();
		jPanel0 = new JPanel();
		jPanel1 = new JPanel();
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		jComboBox1 = new JComboBox();
		jComboBox2 = new JComboBox();
		jComboBox3 = new JComboBox();
		jComboBox4 = new JComboBox();//–¬‘ˆµƒœ¬¿≠øÚJComboBox
		jComboBox5 = new JComboBox();//–¬‘ˆµƒœ¬¿≠øÚJComboBox
		jComboBox6 = new JComboBox();//–¬‘ˆµƒœ¬¿≠øÚJComboBox
		jComboBox7 = new JComboBox();//–¬‘ˆµƒœ¬¿≠øÚJComboBox
		jComboBox8 = new JComboBox();//–¬‘ˆµƒœ¬¿≠øÚJComboBox
		jComboBox9 = new JComboBox();//–¬‘ˆµƒœ¬¿≠øÚJComboBox
		jComboBox10 = new JComboBox();//–¬‘ˆµƒœ¬¿≠øÚJComboBox
		jComboBox11 = new JComboBox();//–¬‘ˆµƒœ¬¿≠øÚJComboBox
		jComboBox12 = new JComboBox();//–¬‘ˆµƒœ¬¿≠øÚJComboBox
		jComboBox13 = new JComboBox();//–¬‘ˆµƒœ¬¿≠øÚJComboBox
		jComboBox14 = new JComboBox();//–¬‘ˆµƒœ¬¿≠øÚJComboBox
		jComboBox14.setEnabled(false);
		jPanel2 = new JPanel();
		jLabel4 = new JLabel();
		jRadioButton1 = new JRadioButton("◊‘∂®“Â");
		jRadioButton2 = new JRadioButton("÷«ƒ‹∆•≈‰");
		buttonGroup1.add(jRadioButton1);
		buttonGroup1.add(jRadioButton2);
		jRadioButton1.setSelected(true);
		jRadioButton1.addItemListener(this);
		jRadioButton2.addItemListener(this);

		jLabel5 = new JLabel();
		jCheckBox1 = new JCheckBox(" ◊Û≤‡√Ê£®¿‰∂≥£©",false);
		jCheckBox2 = new JCheckBox(" ”“≤‡√Ê£®¿‰∂≥£©",false);
		jCheckBox3 = new JCheckBox(" ±≥√Ê    £®¿‰∂≥£©",false);
		jCheckBox4 = new JCheckBox(" √≈ÃÂ    £®¿‰∂≥£©",false);
		jCheckBox5 = new JCheckBox(" ◊Û≤‡√Ê£®¿‰≤ÿ£©",false);
		jCheckBox6 = new JCheckBox(" ”“≤‡√Ê£®¿‰≤ÿ£©",false);
		jCheckBox7 = new JCheckBox(" ±≥√Ê    £®¿‰≤ÿ£©",false);
		jCheckBox8 = new JCheckBox(" √≈ÃÂ    £®¿‰≤ÿ£©",false);
		jCheckBox9 = new JCheckBox(" ∂•≤ø",false);
		jCheckBox10 = new JCheckBox(" µ◊≤ø",false);

		jCheckBox1.addItemListener(this);
		jCheckBox2.addItemListener(this);
		jCheckBox3.addItemListener(this);
		jCheckBox4.addItemListener(this);
		jCheckBox5.addItemListener(this);
		jCheckBox6.addItemListener(this);
		jCheckBox7.addItemListener(this);
		jCheckBox8.addItemListener(this);
		jCheckBox9.addItemListener(this);
		jCheckBox10.addItemListener(this);

		jPanel3 = new JPanel();
		jPanel4 = new JPanel();
		jPanel5 = new JPanel();
		jLabel6 = new JLabel();
		jLabel7 = new JLabel();
		jLabel8 = new JLabel();

		jLabel9 = new JLabel();
		jLabel9 = new JLabel();
		jLabel10 = new JLabel();//–¬‘ˆµƒJLabel
		jLabel11 = new JLabel();//–¬‘ˆµƒJLabel
		jLabel12 = new JLabel();//–¬‘ˆµƒJLabel
		jLabel13 = new JLabel();//–¬‘ˆµƒJLabel
		jLabel14 = new JLabel();//–¬‘ˆµƒJLabel
		jLabel15 = new JLabel();//–¬‘ˆµƒJLabel
		jLabel16 = new JLabel();//–¬‘ˆµƒJLabel
		jLabel17 = new JLabel();//–¬‘ˆµƒJLabel
		jLabel18 = new JLabel();//–¬‘ˆµƒJLabel
		jLabel19 = new JLabel();//–¬‘ˆµƒJLabel
		jLabel20 = new JLabel();//–¬‘ˆµƒJLabel
		jLabel21 = new JLabel();//–¬‘ˆµƒJLabel

		text1 = new TextField();
		text2 = new TextField();
		text3 = new TextField();

		Handle1 handle1 = new Handle1(page2.this);
		text1.addActionListener(handle1);
		text2.addActionListener(handle1);
		text3.addActionListener(handle1);
		jButton1 = new JButton();
		jButton1.addActionListener(handle1);


		int size = 16;
		String ziti = "";

		jLabel1.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel2.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel3.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel4.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel5.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel6.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel7.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel8.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel9.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel10.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel11.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel12.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel13.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel14.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel15.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel16.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel17.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel18.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel19.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel20.setFont(new Font(ziti, 0, size)); // NOI18N
		jLabel21.setFont(new Font(ziti, 0, size)); // NOI18N

		jLabel1.setText("ª˙–Õ—°‘Ò");

		jLabel2.setText("±˘œ‰¿‡–Õ");

		jLabel3.setText("ª∑æ≥Œ¬∂»");

		jComboBox1.setModel(new DefaultComboBoxModel(new String[] { "BCD-430W",
				"BCD-416W", "BCD-320W", "BCD-505W", "BCD-639W"}));
		jComboBox1.addItemListener((ItemListener) this);

		jComboBox2.setModel(new DefaultComboBoxModel(new String[] { " Æ◊÷∂‘ø™",
				"Àƒ√≈", "»˝√≈", "¡Ω√≈", "“‚ Ω", "∑® Ω∂‘ø™", }));
		jComboBox2.addItemListener((ItemListener) this);

		jComboBox3.setModel(new DefaultComboBoxModel(new String[] { "32°Ê",
				"16°Ê","38°Ê","43°Ê" }));
		jComboBox3.addItemListener((ItemListener) this);

		jComboBox4.setModel(new DefaultComboBoxModel(new String[] {"15mm", "12mm", "10mm", "8mm" }));
		jComboBox5.setModel(new DefaultComboBoxModel(new String[] {"15mm", "12mm", "10mm", "8mm"}));
		jComboBox6.setModel(new DefaultComboBoxModel(new String[] {"15mm", "12mm", "10mm", "8mm"}));
		jComboBox7.setModel(new DefaultComboBoxModel(new String[] {"15mm", "12mm", "10mm", "8mm"}));
		jComboBox8.setModel(new DefaultComboBoxModel(new String[] {"15mm", "12mm", "10mm", "8mm" }));
		jComboBox9.setModel(new DefaultComboBoxModel(new String[] {"15mm", "12mm", "10mm", "8mm" }));
		jComboBox10.setModel(new DefaultComboBoxModel(new String[] {"15mm", "12mm", "10mm", "8mm" }));
		jComboBox11.setModel(new DefaultComboBoxModel(new String[] {"15mm", "12mm", "10mm", "8mm" }));
		jComboBox12.setModel(new DefaultComboBoxModel(new String[] {"15mm", "12mm", "10mm", "8mm" }));
		jComboBox13.setModel(new DefaultComboBoxModel(new String[] {"15mm", "12mm", "10mm", "8mm" }));
		jComboBox14.setModel(new DefaultComboBoxModel(new String[] {"15mm", "12mm", "10mm", "8mm" }));

		jComboBox4.addItemListener((ItemListener) this);
		jComboBox5.addItemListener((ItemListener) this);
		jComboBox6.addItemListener((ItemListener) this);
		jComboBox7.addItemListener((ItemListener) this);
		jComboBox8.addItemListener((ItemListener) this);
		jComboBox9.addItemListener((ItemListener) this);
		jComboBox10.addItemListener((ItemListener) this);
		jComboBox11.addItemListener((ItemListener) this);
		jComboBox12.addItemListener((ItemListener) this);
		jComboBox13.addItemListener((ItemListener) this);
		jComboBox14.addItemListener((ItemListener) this);

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup()
												.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGap(47, 47, 47))
										.addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
												.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGap(47, 47, 47))
										.addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
												.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGap(61, 61, 61)))
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(jComboBox1, GroupLayout.Alignment.TRAILING, 0, 101, Short.MAX_VALUE)
										.addComponent(jComboBox2, GroupLayout.Alignment.TRAILING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jComboBox3, GroupLayout.Alignment.TRAILING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap())
		);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGap(23, 23, 23)
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel1)
										.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel2)
										.addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel3)
										.addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(18, Short.MAX_VALUE))
		);

		jPanel2.setBorder(BorderFactory.createTitledBorder(""));

		jLabel4.setText("VIP∞Â π”√∑Ω∞∏");

		jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton1ActionPerformed(evt);
			}
		});

		jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton2ActionPerformed(evt);
			}
		});

//	        jLabel20.setText("◊‘∂®“Â");
//
//	        jLabel21.setText("÷«ƒ‹∆•≈‰");

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup()
												.addComponent(jLabel4)
												.addGap(0, 0, Short.MAX_VALUE))
										.addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
												.addComponent(jRadioButton1)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel20)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jRadioButton2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel21)
												.addGap(16, 16, 16))))
		);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addGap(20, 20, 20)
								.addComponent(jLabel4)
								.addGap(18, 18, 18)
								.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
										.addComponent(jRadioButton1)
										.addComponent(jLabel20)
										.addComponent(jRadioButton2)
										.addComponent(jLabel21))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		jPanel3.setBorder(BorderFactory.createTitledBorder(""));

		jLabel6.setText("«Î ‰»ÎVIP∞Âµƒ                             ");

		jLabel7.setText("√Êª˝       £®µ•Œªm2£©");

		jLabel8.setText("∫Ò∂»       £®µ•Œªmm£©");

		jLabel9.setText("µº»»œµ ˝   £®W/m.°Ê£©");

		text1.setText("1");
		text1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				text1ActionPerformed(evt);
			}
		});
		text1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				int keyChar = e.getKeyChar();
				if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9
						|| keyChar == KeyEvent.VK_PERIOD) {

				} else {
					e.consume(); // πÿº¸£¨∆¡±ŒµÙ∑«∑® ‰»Î
				}
			}
		});
		text3.setText("0.0025");
		text3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				text3ActionPerformed(evt);
			}
		});
		text3.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				int keyChar = e.getKeyChar();
				if (keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9
						|| keyChar == KeyEvent.VK_PERIOD) {

				} else {
					e.consume(); // πÿº¸£¨∆¡±ŒµÙ∑«∑® ‰»Î
				}
			}
		});
		jComboBox14.setModel(new DefaultComboBoxModel(new String[] { "15","12", "10", "8"}));

		GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel6)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
								.addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(jComboBox14, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(text1)
										.addComponent(text3))
								.addContainerGap())
		);
		jPanel3Layout.setVerticalGroup(
				jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(text1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel7)
										.addComponent(jLabel6))
								.addGap(18, 18, 18)
								.addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel8)
										.addComponent(jComboBox14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel9)
										.addComponent(text3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		jPanel4.setBorder(BorderFactory.createTitledBorder(""));


		jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox1ActionPerformed(evt);
			}
		});

		jLabel5.setText("«Î—°‘ÒVIP∞Â∑≈÷√∑Ω∞∏");


		jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox6ActionPerformed(evt);
			}
		});

//	        jLabel13.setText("±≥√Ê    £®¿‰≤ÿ£©");

		jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox8ActionPerformed(evt);
			}
		});

		jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox9ActionPerformed(evt);
			}
		});


		GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(
				jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel4Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(jPanel4Layout.createSequentialGroup()
												.addComponent(jLabel5)
												.addGap(0, 0, Short.MAX_VALUE))
										.addGroup(jPanel4Layout.createSequentialGroup()
												.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
														.addGroup(jPanel4Layout.createSequentialGroup()
																.addComponent(jCheckBox1)
																.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jLabel10))
														.addGroup(jPanel4Layout.createSequentialGroup()
																.addComponent(jCheckBox3)
																.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jLabel11))
														.addGroup(jPanel4Layout.createSequentialGroup()
																.addComponent(jCheckBox5)
																.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jLabel12))
														.addGroup(jPanel4Layout.createSequentialGroup()
																.addComponent(jCheckBox9)
																.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jLabel14))
														.addGroup(jPanel4Layout.createSequentialGroup()
																.addComponent(jCheckBox7)
																.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jLabel13)))
												.addGap(2, 2, 2)
												.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
														.addComponent(jComboBox4, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
														.addComponent(jComboBox5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(jComboBox6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(jComboBox7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(jComboBox8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
														.addComponent(jCheckBox8, GroupLayout.Alignment.TRAILING)
														.addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
																.addComponent(jCheckBox10)
																.addComponent(jCheckBox6))
														.addComponent(jCheckBox2, GroupLayout.Alignment.TRAILING)
														.addComponent(jCheckBox4, GroupLayout.Alignment.TRAILING))))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(jLabel15)
												.addComponent(jLabel16)
												.addComponent(jLabel17)
												.addComponent(jLabel18, GroupLayout.Alignment.TRAILING))
										.addComponent(jLabel19))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(jComboBox9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jComboBox10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jComboBox11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jComboBox12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jComboBox13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addContainerGap())
		);

		jPanel4Layout.linkSize(SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBox10, jComboBox11, jComboBox12, jComboBox13, jComboBox4, jComboBox5, jComboBox6, jComboBox7, jComboBox8, jComboBox9});

		jPanel4Layout.setVerticalGroup(
				jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel4Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel5)
								.addGap(18, 18, 18)
								.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
										.addComponent(jCheckBox1)
										.addComponent(jLabel10)
										.addComponent(jComboBox4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jCheckBox2)
										.addComponent(jLabel15)
										.addComponent(jComboBox9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(10, 10, 10)
								.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
										.addComponent(jCheckBox3)
										.addComponent(jLabel11)
										.addComponent(jComboBox5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel16)
										.addComponent(jCheckBox4)
										.addComponent(jComboBox10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(10, 10, 10)
								.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
										.addComponent(jCheckBox5)
										.addComponent(jLabel12)
										.addComponent(jComboBox6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jCheckBox6)
										.addComponent(jLabel17)
										.addComponent(jComboBox11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(10, 10, 10)
								.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
										.addComponent(jCheckBox7)
										.addComponent(jLabel13)
										.addComponent(jComboBox7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jCheckBox8)
										.addComponent(jLabel18)
										.addComponent(jComboBox12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
										.addComponent(jCheckBox9)
										.addComponent(jLabel14)
										.addComponent(jComboBox8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(jCheckBox10)
										.addComponent(jLabel19)
										.addComponent(jComboBox13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addContainerGap())
		);

		jButton1.setText("»∑∂®");

		GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(
				jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel5Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jButton1)
								.addContainerGap())
		);
		jPanel5Layout.setVerticalGroup(
				jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel5Layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jButton1)
								.addContainerGap())
		);

		GroupLayout jPanel0Layout = new GroupLayout(jPanel0);
		jPanel0.setLayout(jPanel0Layout);
		jPanel0Layout.setHorizontalGroup(
				jPanel0Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel0Layout.createSequentialGroup()
								.addGap(202, 202, 202)
								.addGroup(jPanel0Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(jPanel0Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
												.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addContainerGap(74, Short.MAX_VALUE))
		);
		jPanel0Layout.setVerticalGroup(
				jPanel0Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(jPanel0Layout.createSequentialGroup()
								.addGap(40, 40, 40)
								.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(47, Short.MAX_VALUE))
		);

		GroupLayout layout = new GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jPanel0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(18, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanel0, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(0, 191, Short.MAX_VALUE))
		);

	}// </editor-fold>

	private void text1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void text3ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {

	}


	@Override
	public void itemStateChanged(ItemEvent ev) {
		if (ev.getStateChange() == ItemEvent.SELECTED
				&& ev.getSource() == jRadioButton2) {
			jCheckBox1.setSelected(true);
			jCheckBox2.setSelected(true);
			jCheckBox3.setSelected(true);
			jCheckBox4.setSelected(true);
			jCheckBox5.setSelected(true);
			jCheckBox6.setSelected(true);
			jCheckBox7.setSelected(true);
			jCheckBox8.setSelected(true);
			jCheckBox9.setSelected(true);
			jCheckBox10.setSelected(true);

			jCheckBox1.setEnabled(false);
			jCheckBox2.setEnabled(false);
			jCheckBox3.setEnabled(false);
			jCheckBox4.setEnabled(false);
			jCheckBox5.setEnabled(false);
			jCheckBox6.setEnabled(false);
			jCheckBox7.setEnabled(false);
			jCheckBox8.setEnabled(false);
			jCheckBox9.setEnabled(false);
			jCheckBox10.setEnabled(false);
			jComboBox4.setForeground(Color.GRAY);
			jComboBox5.setForeground(Color.GRAY);
			jComboBox6.setForeground(Color.GRAY);
			jComboBox7.setForeground(Color.GRAY);
			jComboBox8.setForeground(Color.GRAY);
			jComboBox9.setForeground(Color.GRAY);
			jComboBox10.setForeground(Color.GRAY);
			jComboBox11.setForeground(Color.GRAY);
			jComboBox12.setForeground(Color.GRAY);
			jComboBox13.setForeground(Color.GRAY);

			jComboBox4.setEnabled(false);
			jComboBox5.setEnabled(false);
			jComboBox6.setEnabled(false);
			jComboBox7.setEnabled(false);
			jComboBox8.setEnabled(false);
			jComboBox9.setEnabled(false);
			jComboBox10.setEnabled(false);
			jComboBox11.setEnabled(false);
			jComboBox12.setEnabled(false);
			jComboBox13.setEnabled(false);
			jComboBox14.setEnabled(true);
			jLabel8.setVisible(true);
			vip.newvip=0;
//			jCheckBox4.setForeground(Color.GRAY);
//			jCheckBox5.setForeground(Color.GRAY);
//			jCheckBox6.setForeground(Color.GRAY);
//			jCheckBox7.setForeground(Color.GRAY);
//			jCheckBox8.setForeground(Color.GRAY);
//			jCheckBox9.setForeground(Color.GRAY);
//			jCheckBox10.setForeground(Color.GRAY);
//			jCheckBox3.setForeground(Color.GRAY);
//			jCheckBox2.setForeground(Color.GRAY);
//			jCheckBox1.setForeground(Color.GRAY);
			vip.thickness1 = vip.thickness;
			vip.thickness2 = vip.thickness;
			vip.thickness3 = vip.thickness;
			vip.thickness4 = vip.thickness;
			vip.thickness5 = vip.thickness;
			vip.thickness6 = vip.thickness;
			vip.thickness7 = vip.thickness;
			vip.thickness8 = vip.thickness;
			vip.thickness9 = vip.thickness;
			vip.thickness10 = vip.thickness;
		}

		else if (ev.getStateChange() == ItemEvent.SELECTED
				&& ev.getSource() == jRadioButton1) {
			jCheckBox1.setSelected(false);
			jCheckBox2.setSelected(false);
			jCheckBox3.setSelected(false);
			jCheckBox4.setSelected(false);
			jCheckBox5.setSelected(false);
			jCheckBox6.setSelected(false);
			jCheckBox7.setSelected(false);
			jCheckBox8.setSelected(false);
			jCheckBox9.setSelected(false);
			jCheckBox10.setSelected(false);

			jCheckBox1.setEnabled(true);
			jCheckBox2.setEnabled(true);
			jCheckBox3.setEnabled(true);
			jCheckBox4.setEnabled(true);
			jCheckBox5.setEnabled(true);
			jCheckBox6.setEnabled(true);
			jCheckBox7.setEnabled(true);
			jCheckBox8.setEnabled(true);
			jCheckBox9.setEnabled(true);
			jCheckBox10.setEnabled(true);
			jComboBox14.setEnabled(false);

			jComboBox4.setEnabled(true);
			jComboBox5.setEnabled(true);
			jComboBox6.setEnabled(true);
			jComboBox7.setEnabled(true);
			jComboBox8.setEnabled(true);
			jComboBox9.setEnabled(true);
			jComboBox10.setEnabled(true);
			jComboBox11.setEnabled(true);
			jComboBox12.setEnabled(true);
			jComboBox13.setEnabled(true);
			jComboBox4.setForeground(Color.BLACK);
			jComboBox5.setForeground(Color.BLACK);
			jComboBox6.setForeground(Color.BLACK);
			jComboBox7.setForeground(Color.BLACK);
			jComboBox8.setForeground(Color.BLACK);
			jComboBox9.setForeground(Color.BLACK);
			jComboBox10.setForeground(Color.BLACK);
			jComboBox11.setForeground(Color.BLACK);
			jComboBox12.setForeground(Color.BLACK);
			jComboBox13.setForeground(Color.BLACK);

			vip.thickness1 = vip.thickness11;
			vip.thickness2 = vip.thickness22;
			vip.thickness3 = vip.thickness33;
			vip.thickness4 = vip.thickness44;
			vip.thickness5 = vip.thickness55;
			vip.thickness6 = vip.thickness66;
			vip.thickness7 = vip.thickness77;
			vip.thickness8 = vip.thickness88;
			vip.thickness9 = vip.thickness99;
			vip.thickness10 = vip.thickness1010;

		} else if (ev.getStateChange() == ItemEvent.SELECTED
				&& ev.getSource() == jComboBox1)// ª˙–Õ—°‘Ò
		{
			System.out.println(jComboBox1.getSelectedItem());// ª˙–Õ—°‘Ò
			if(jComboBox1.getSelectedItem()=="BCD-320W"){
				vip.type="BCD-320W";
				vip.B5=650;vip.C5=600;vip.D5=1757.5;vip.E5=67.5;vip.K5=10;vip.L5=237;vip.N5=200;vip.O5=71;vip.P5=87;vip.Q5=52;vip.R5=55;vip.S5=60;vip.T5=70;vip.U5=248;vip.V5=777;vip.W5=18;vip.X5=852.5;vip.Y5=834;vip.Z5=47;vip.AA5=20;vip.AB5=284;vip.AC5=894.5;vip.AD5=75;vip.AE5=83;vip.AF5=81;vip.AG5=64.6;vip.AH5=74.5;vip.AI5=498;vip.AJ5=464;vip.AK5=67;vip.AL5=701;vip.AM5=357.5;vip.AN5=608;
			}else if(jComboBox1.getSelectedItem()=="BCD-430W"){
				vip.type="BCD-430W";
				vip.B5=780;vip.C5=600;vip.D5=1766;vip.E5=79;vip.K5=10;vip.L5=236;vip.N5=199;vip.O5=80;vip.P5=85;vip.Q5=57;vip.R5=58;vip.S5=65;vip.T5=77;vip.U5=306;vip.V5=782;vip.W5=18;vip.X5=858;vip.Y5=840;vip.Z5=47;vip.AA5=20;vip.AB5=348;vip.AC5=903;vip.AD5=57;vip.AE5=94;vip.AF5=80;vip.AG5=77;vip.AH5=91;vip.AI5=556;vip.AJ5=472;vip.AK5=58;vip.AL5=695;vip.AM5=348;vip.AN5=749;
			}else if(jComboBox1.getSelectedItem()=="BCD-416W"){
				vip.type="BCD-416W";
				vip.B5=780;vip.C5=600;vip.D5=1766;vip.E5=82;vip.K5=10;vip.L5=236;vip.N5=199;vip.O5=80;vip.P5=85;vip.Q5=57;vip.R5=58;vip.S5=65;vip.T5=77;vip.U5=306;vip.V5=782;vip.W5=18;vip.X5=858;vip.Y5=840;vip.Z5=47;vip.AA5=20;vip.AB5=348;vip.AC5=903;vip.AD5=57;vip.AE5=84;vip.AF5=80;vip.AG5=75;vip.AH5=81;vip.AI5=547;vip.AJ5=472;vip.AK5=87;vip.AL5=718;vip.AM5=738;vip.AN5=357;
			}else if(jComboBox1.getSelectedItem()=="BCD-505W"){
				vip.type="BCD-505W";
				vip.B5=780;vip.C5=600;vip.D5=1766;vip.E5=79;vip.K5=10;vip.L5=236; vip.N5=199; vip.O5=80;vip.P5=85;vip.Q5=47;vip.R5=38;vip.S5=65;vip.T5=77;vip.U5=306;vip.V5=782;vip.W5=18;vip.X5=858;vip.Y5=840;vip.Z5=47;vip.AA5=20;vip.AB5=348;vip.AC5=903; vip.AD5=57; vip.AE5=48;vip.AF5=90;vip.AG5=77;vip.AH5=91;vip.AI5=556; vip.AJ5=472;vip.AK5=58;vip.AL5=695; vip.AM5=348;vip.AN5=749;
			}else if(jComboBox1.getSelectedItem()=="BCD-639W"){
				vip.type="BCD-639W";
//				vip.B5=905;vip.C5=700;vip.D5=1765.5;vip.E5=83;vip.K5=10;vip.L5=236; vip.N5=199; vip.O5=80;vip.P5=80;vip.Q5=52;vip.R5=56;vip.S5=80;vip.T5=75;vip.U5=610;vip.V5=782;vip.W5=35;vip.X5=864;vip.Y5=910;vip.Z5=47;vip.AA5=20;vip.AB5=410;vip.AC5=928; vip.AD5=65; vip.AE5=75;vip.AF5=85;vip.AG5=77;vip.AH5=84;vip.AI5=697; vip.AJ5=440;vip.AK5=58;vip.AL5=684; vip.AM5=414;vip.AN5=728; 
				vip.B5=905;vip.C5=700;vip.D5=1766;vip.E5=82;vip.K5=10;vip.L5=236; vip.N5=199; vip.O5=80;vip.P5=80;vip.Q5=52;vip.R5=56;vip.S5=80;vip.T5=75;vip.U5=610;vip.V5=782;vip.W5=35;vip.X5=864;vip.Y5=910;vip.Z5=47;vip.AA5=20;vip.AB5=410;vip.AC5=928; vip.AD5=65; vip.AE5=75;vip.AF5=85;vip.AG5=77;vip.AH5=84;vip.AI5=697; vip.AJ5=440;vip.AK5=58;vip.AL5=684; vip.AM5=414;vip.AN5=728;
			}
			vip.supply = vip.U5 + 2 * (2 * vip.thickness7)*Math.pow(10, 3);//small÷–a
			Main.tab.remove(Main.pan3);
			Main.pan3  = new page3();
			Main.tab.add(Main.pan3, "œ‰ÃÂ≥ﬂ¥Á", 2);
			Main.cont.add(Main.tab);

		} else if (ev.getStateChange() == ItemEvent.SELECTED
				&& ev.getSource() == jComboBox2)
		{
			System.out.println(jComboBox2.getSelectedItem());
		} else if (ev.getStateChange() == ItemEvent.SELECTED
				&& ev.getSource() == jComboBox3)
		{
			if (jComboBox3.getSelectedItem() == "16°Ê") {
				vip.temp = 16;
				vip.C18=vip.D18;
				vip.C19=vip.D19;
				vip.C20=vip.D20;
				vip.C21=vip.D21;
				vip.C22=vip.D22;
				vip.C23=vip.D23;
//				vip.C24=vip.D24;
			} else if (jComboBox3.getSelectedItem() == "32°Ê") {
				vip.temp = 32;
				vip.C18=4;
				vip.C19=-18;
				vip.C20=47;
				vip.C21=-24;
				vip.C22=37;
				vip.C23=-20;
				vip.C24=98;
			}
			else if (jComboBox3.getSelectedItem() == "38°Ê") {
				vip.temp = 38;
				vip.C18=vip.F18;
				vip.C19=vip.F19;
				vip.C20=vip.F20;
				vip.C21=vip.F21;
				vip.C22=vip.F22;
				vip.C23=vip.F23;
			}else if (jComboBox3.getSelectedItem() == "43°Ê") {
				vip.temp = 43;
				vip.C18=vip.G18;
				vip.C19=vip.G19;
				vip.C20=vip.G20;
				vip.C21=vip.G21;
				vip.C22=vip.G22;
				vip.C23=vip.G23;
			}

			Main.tab.remove(Main.pan3);
			Main.pan3  = new page3();
			Main.tab.add(Main.pan3, "œ‰ÃÂ≥ﬂ¥Á", 2);
			Main.cont.add(Main.tab);
		} else if (ev.getSource() == jCheckBox1
				&& ev.getStateChange() == ItemEvent.SELECTED) {
			vip.SS_4 = 0;
			vip.SS_6 = 0;
			vip.newvip=0;
		} else if (ev.getSource() == jCheckBox1
				&& ev.getStateChange() == ItemEvent.DESELECTED) {
			vip.SS_4 = 1;
			vip.SS_6 = 1;
			vip.newvip=0;
		} else if (ev.getSource() == jCheckBox2
				&& ev.getStateChange() == ItemEvent.SELECTED) {
			vip.SS_5 = 0;
			vip.SS_7 = 0;
			vip.newvip=0;

		} else if (ev.getSource() == jCheckBox2
				&& ev.getStateChange() == ItemEvent.DESELECTED) {
			vip.SS_5 = 1;
			vip.SS_7 = 1;
			vip.newvip=0;

		} else if (ev.getSource() == jCheckBox3
				&& ev.getStateChange() == ItemEvent.SELECTED) {
			vip.SS_3 = 0;
			vip.newvip=0;

		} else if (ev.getSource() == jCheckBox3
				&& ev.getStateChange() == ItemEvent.DESELECTED) {
			vip.SS_3 = 1;
			vip.newvip=0;
		} else if (ev.getSource() == jCheckBox4
				&& ev.getStateChange() == ItemEvent.SELECTED) {
			vip.SS_10 = 0;
			vip.SS_11 = 0;
			vip.newvip=0;
		} else if (ev.getSource() == jCheckBox4
				&& ev.getStateChange() == ItemEvent.DESELECTED) {
			vip.SS_10 = 1;
			vip.SS_11 = 1;
			vip.newvip=0;
		} else if (ev.getSource() == jCheckBox5
				&& ev.getStateChange() == ItemEvent.SELECTED) {
			vip.SS_8 = 0;
			vip.newvip=0;
		} else if (ev.getSource() == jCheckBox5
				&& ev.getStateChange() == ItemEvent.DESELECTED) {
			vip.SS_8 = 1;
			vip.newvip=0;
		} else if (ev.getSource() == jCheckBox6
				&& ev.getStateChange() == ItemEvent.SELECTED) {
			vip.SS_9 = 0;
			vip.newvip=0;
		} else if (ev.getSource() == jCheckBox6
				&& ev.getStateChange() == ItemEvent.DESELECTED) {
			vip.SS_9 = 1;
			vip.newvip=0;
		} else if (ev.getSource() == jCheckBox7
				&& ev.getStateChange() == ItemEvent.SELECTED) {
			vip.SS_1 = 0;
			vip.SS_2 = 0;
			vip.newvip=0;
		} else if (ev.getSource() == jCheckBox7
				&& ev.getStateChange() == ItemEvent.DESELECTED) {
			vip.SS_1 = 1;
			vip.SS_2 = 1;
			vip.newvip=0;
		} else if (ev.getSource() == jCheckBox8
				&& ev.getStateChange() == ItemEvent.SELECTED) {
			vip.SS_12 = 0;
			vip.SS_13 = 0;
			vip.newvip=0;
		} else if (ev.getSource() == jCheckBox8
				&& ev.getStateChange() == ItemEvent.DESELECTED) {
			vip.SS_12 = 1;
			vip.SS_13 = 1;
			vip.newvip=0;
		} else if (ev.getSource() == jCheckBox9
				&& ev.getStateChange() == ItemEvent.SELECTED) {
			vip.SS_14 = 0;
			vip.newvip=0;
		} else if (ev.getSource() == jCheckBox9
				&& ev.getStateChange() == ItemEvent.DESELECTED) {
			vip.SS_14 = 1;
			vip.newvip=0;
		} else if (ev.getSource() == jCheckBox10
				&& ev.getStateChange() == ItemEvent.SELECTED) {
			vip.SS_15 = 0;
			vip.newvip=0;
		} else if (ev.getSource() == jCheckBox10
				&& ev.getStateChange() == ItemEvent.DESELECTED) {
			vip.SS_15 = 1;
			vip.newvip=0;
		}
		else if (ev.getStateChange() == ItemEvent.SELECTED
				&& ev.getSource() == jComboBox14)
		{
			if (jComboBox14.getSelectedItem() == "8") {
				vip.thickness = 0.008;

			} else if (jComboBox14.getSelectedItem() == "10") {

				vip.thickness = 0.010;
			}
			else if (jComboBox14.getSelectedItem() == "12") {

				vip.thickness = 0.012;

			}else if (jComboBox14.getSelectedItem() == "15") {

				vip.thickness = 0.015;
			}

			vip.thickness1 = vip.thickness;
			vip.thickness2 = vip.thickness;
			vip.thickness3 = vip.thickness;
			vip.thickness4 = vip.thickness;
			vip.thickness5 = vip.thickness;
			vip.thickness6 = vip.thickness;
			vip.thickness7 = vip.thickness;
			vip.thickness8 = vip.thickness;
			vip.thickness9 = vip.thickness;
			vip.thickness10 = vip.thickness;
		}


		else if (ev.getStateChange() == ItemEvent.SELECTED
				&& ev.getSource() == jComboBox4)
		{

			if (jComboBox4.getSelectedItem() == "8mm") {
				vip.thickness1 = 0.008;
			} else if (jComboBox4.getSelectedItem() == "10mm") {
				vip.thickness1 = 0.010;
			}
			else if (jComboBox4.getSelectedItem() == "12mm") {
				vip.thickness1 = 0.012;
			}else if (jComboBox4.getSelectedItem() == "15mm") {
				vip.thickness1 = 0.015;
			}

			vip.thickness11 = vip.thickness1;
		}
		else if (ev.getStateChange() == ItemEvent.SELECTED
				&& ev.getSource() == jComboBox5)
		{
			if (jComboBox5.getSelectedItem() == "8mm") {
				vip.thickness3 = 0.008;
			} else if (jComboBox5.getSelectedItem() == "10mm") {
				vip.thickness3 = 0.010;
			}
			else if (jComboBox5.getSelectedItem() == "12mm") {
				vip.thickness3 = 0.012;
			}else if (jComboBox5.getSelectedItem() == "15mm") {
				vip.thickness3 = 0.015;
			}
			vip.thickness33 = vip.thickness3 ;
		}
		else if (ev.getStateChange() == ItemEvent.SELECTED
				&& ev.getSource() == jComboBox6)
		{

			if (jComboBox6.getSelectedItem() == "8mm") {
				vip.thickness5 = 0.008;
			} else if (jComboBox6.getSelectedItem() == "10mm") {
				vip.thickness5 = 0.010;
			}
			else if (jComboBox6.getSelectedItem() == "12mm") {
				vip.thickness5 = 0.012;
			}else if (jComboBox6.getSelectedItem() == "15mm") {
				vip.thickness5 = 0.015;
			}
			vip.thickness55 = vip.thickness5 ;
		}
		else if (ev.getStateChange() == ItemEvent.SELECTED
				&& ev.getSource() == jComboBox7)
		{

			if (jComboBox7.getSelectedItem() == "8mm") {

				vip.thickness7 = 0.008;

			} else if (jComboBox7.getSelectedItem() == "10mm") {

				vip.thickness7 = 0.010;

			}
			else if (jComboBox7.getSelectedItem() == "12mm") {

				vip.thickness7 = 0.012;

			}else if (jComboBox7.getSelectedItem() == "15mm") {

				vip.thickness7 = 0.015;
			}
			vip.thickness77 = vip.thickness7 ;
		}

		else if (ev.getStateChange() == ItemEvent.SELECTED
				&& ev.getSource() == jComboBox8)
		{

			if(jComboBox8.getSelectedItem()=="8mm"){

				vip.thickness9=0.008;

			}else if(jComboBox8.getSelectedItem()=="10mm"){

				vip.thickness9=0.010;

			}
			else if(jComboBox8.getSelectedItem()=="12mm"){

				vip.thickness9=0.012;

			}else if(jComboBox8.getSelectedItem()=="15mm"){

				vip.thickness9=0.015;
			}

			vip.thickness99 = vip.thickness9 ;
		}

		else if (ev.getStateChange() == ItemEvent.SELECTED
				&& ev.getSource() == jComboBox9)
		{

			if (jComboBox9.getSelectedItem() == "8mm") {

				vip.thickness2 = 0.008;
			} else if (jComboBox9.getSelectedItem() == "10mm") {
				vip.thickness2 = 0.010;
			}
			else if (jComboBox9.getSelectedItem() == "12mm") {

				vip.thickness2 = 0.012;

			}else if (jComboBox9.getSelectedItem() == "15mm") {

				vip.thickness2 = 0.015;
			}

			vip.thickness22 = vip.thickness2 ;

		}
		else if (ev.getStateChange() == ItemEvent.SELECTED
				&& ev.getSource() == jComboBox10)
		{

			if (jComboBox10.getSelectedItem() == "8mm") {

				vip.thickness4 = 0.008;

			} else if (jComboBox10.getSelectedItem() == "10mm") {

				vip.thickness4 = 0.010;

			}
			else if (jComboBox10.getSelectedItem() == "12mm") {

				vip.thickness4 = 0.012;

			}else if (jComboBox10.getSelectedItem() == "15mm") {

				vip.thickness4 = 0.015;

			}

			vip.thickness44 = vip.thickness4 ;

		}
		else if (ev.getStateChange() == ItemEvent.SELECTED
				&& ev.getSource() == jComboBox11)
		{

			if (jComboBox11.getSelectedItem() == "8mm") {vip.thickness6 = 0.008;}
			else if (jComboBox11.getSelectedItem() == "10mm") {vip.thickness6 = 0.010;}
			else if (jComboBox11.getSelectedItem() == "12mm") {vip.thickness6 = 0.012;}
			else if (jComboBox11.getSelectedItem() == "15mm") {vip.thickness6 = 0.015;}

			vip.thickness66 = vip.thickness6 ;
		}
		else if (ev.getStateChange() == ItemEvent.SELECTED
				&& ev.getSource() == jComboBox12)
		{
			if (jComboBox12.getSelectedItem() == "8mm") {	vip.thickness8 = 0.008;	}
			else if (jComboBox12.getSelectedItem() == "10mm") { vip.thickness8 = 0.010;}
			else if (jComboBox12.getSelectedItem() == "12mm") { vip.thickness8 = 0.012;}
			else if (jComboBox12.getSelectedItem() == "15mm") {vip.thickness8 = 0.015;}

			vip.thickness88 = vip.thickness8 ;
		}
		else if (ev.getStateChange() == ItemEvent.SELECTED
				&& ev.getSource() == jComboBox13)
		{
			if (jComboBox13.getSelectedItem() == "8mm") {
				vip.thickness10 = 0.008;
			} else if (jComboBox13.getSelectedItem() == "10mm") {
				vip.thickness10 = 0.010;
			}
			else if (jComboBox13.getSelectedItem() == "12mm") {
				vip.thickness10 = 0.012;
			}else if (jComboBox13.getSelectedItem() == "15mm") {
				vip.thickness10 = 0.015;
			}
			vip.thickness1010 = vip.thickness10 ;
		}
	}

	class Handle1 implements ActionListener // ¢Ÿ µœ÷ƒ≥Ω”ø⁄
	{
		protected page2 newjframe;

		public Handle1(page2 newjframe) // ππ‘Ï∫Ø ˝
		{
			this.newjframe = newjframe;
		}

		public void actionPerformed(ActionEvent e) // ¢⁄ µœ÷∏√Ω”ø⁄÷–µƒÀ˘”–∑Ω∑®
		{
			if (e.getActionCommand().equals("»∑∂®"))//  «Red∞¥≈• ¬º˛
			{
				double h1 = Double.valueOf(newjframe.text1.getText());
				double h3 = Double.valueOf(newjframe.text3.getText());
				//
				if (h1 <= 0) {
					vip.viparea = 0;
				} else {
					vip.viparea = h1 * Math.pow(10, 6);
				}

				if (h3 <= 0) {
					vip.heatness = 0;// VIPµº»»œµ ˝
				} else {
					vip.heatness = h3;// VIPµº»»œµ ˝
				}
				setSelectedComponent();

				new page2();

				Main.tab.remove(Main.pan4);
				Main.pan4  = new page4();
				Main.tab.add(Main.pan4, "VIP≥ﬂ¥Á", 3);
				Main.cont.add(Main.tab);
			}
		}
	}
}
