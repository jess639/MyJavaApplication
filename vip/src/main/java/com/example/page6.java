package com.example;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Panel;
import java.text.DecimalFormat;

class MyPanel1 extends Panel {

 public  void paint(Graphics g) {
  Color c = g.getColor();
  DecimalFormat df = new DecimalFormat("#.00");//两位小数
  DecimalFormat d3f = new DecimalFormat("#.0000");//两位小数
  DecimalFormat d3g = new DecimalFormat("0.0000");//两位小数
  DecimalFormat dg = new DecimalFormat("0.000");//0.2% 两位小数，小数点前边不为空
  DecimalFormat di = new DecimalFormat("#");//0.2% 两位小数，小数点前边不为空
  g.setColor(Color.blue);  //设置画笔颜色 
  g.drawString("根据箱体结构稍做调整，模型仅用于8~15mm厚度的阴阳膜VIP板，如膜材有改动需修正",120-70,20);
  g.drawString("已输入的VIP板参数：",120-70,35);
  g.drawString("********************************************************************************************************************************************************************************************************************************",0,85+30);
  g.drawString("以下结果为冰箱各个面所需使用VIP板的最佳尺寸：(w,h分别为各个面的长宽； a,b分别为各个面最佳使用VIP板的长宽； A,B为VIP板到各个面边缘的距离)",120-70,85+45);
  g.drawString("面积        （单位m2 ）：",340-70,35);  if(vip.viparea*Math.pow(10, -6)<1){ g.drawString(d3g.format(vip.viparea*Math.pow(10, -6))+"", 470-70,35);}else{ g.drawString(d3f.format(vip.viparea*Math.pow(10, -6))+"", 470-70,35);};
  g.drawString("厚度        （单位mm）：",340-70,50);   g.drawString(vip.thickness*Math.pow(10, 3)+"", 470-70,50);
  g.drawString("导热系数（W/m.℃  ）：",340-70,65);  g.drawString(vip.heatness+"", 470-70,65);
  g.drawString("推荐使用面积（单位m2  ）：",340-70,80);  g.drawString(d3g.format(vip.areaTuiJian)+"", 470-50,80);
  g.drawString("剩余面积（单位m2  ）：",340-70,95);  g.drawString(d3g.format(vip.areaShengYu)+"", 470-50,95);

  int h=80;
//冷藏室  
//  int a1=50,b1=530+30-h;//lc                left       6   49
//  int a2=260,b2=530+30-h;//lc                right      7   50  +30
////  int a3=260,b3=120+30;//lc                big back   2   53
  int a4=50,b4=120+30;//lc               left door   11  71 **********
//  int a5=890,b5=530+30-h;//lc                right door  10  70
////  int a6=50,b6=120+30;//lc                small back  1   52
  int a7=470,b7=120+30;//lc               top         13  48*****************************
//冷冻室
//  int A1=680,B1=120+30;//ld               left        4   62 64
//  int A2=890,B2=120+30;//ld               right       5   63 65
////  int A3=470,B3=120+30;//ld               back        3   67
  int A4=260,B4=120+30;//ld               bottom      12  66*******************
//  int A5=680,B5=530+30-h;//ld               left door   9   71
//  int A6=470,B6=530+30-h;//ld               right door  8   70
//vip data
  int B=680,C=35;  //32度
//  int BB=980,CC=540;//16度


  g.drawString("("+vip.type+")", B+80,C);//冰箱类型输出
  /*****************************冷藏室******************冷藏室**********************************冷藏室****************************************/
//  g.drawRect(a3-780+780, b3-510+510, 150,300-h);//back big lc
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawRect(a3-780+810, b3-510+530, 100,250-h+10);//back big lc
//  g.setColor(Color.blue);  //设置画笔颜色 
//  g.drawLine(a3-780+850, b3-510+510, a3-780+850, b3-510+530);//A
//  g.drawLine(a3-780+780, b3-510+770-h, a3-780+810, b3-510+770-h);//B
//  g.drawString("冷藏室背面剩余 ", a3-780+820,b3-510+640);
//  g.drawString("A=", a3-780+800-15,b3-510+840-h);
//  g.drawString(dg.format(vip.A2bbig)+"mm", a3-780+815-15,b3-510+840-h);
//  g.drawString("w=", a3-780+800-15,b3-510+860-h);
//  g.drawString(vip.w2bbig+"mm", a3-780+815-15,b3-510+860-h);
//  g.drawString("h=", a3-780+880-15,b3-510+860-h);
//  g.drawString(vip.h2bbig+"mm", a3-780+895-15,b3-510+860-h);
//  g.drawString("B=", a3-780+880-15,b3-510+840-h);
//  g.drawString(vip.B2bbig+"mm", a3-780+895-15,b3-510+840-h);
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawString("a=", a3-780+800-15,b3-510+880-h);
//  g.drawString(vip.a2bbig+"mm", a3-780+815-15,b3-510+880-h);
//  g.drawString("b=", a3-780+880-15,b3-510+880-h);
//  g.drawString(vip.b2bbig+"mm", a3-780+895-15,b3-510+880-h);
//  g.setColor(Color.blue);  //设置画笔颜色 
//  g.drawString("a", a3-780+850,b3-510+775-h);
//  g.drawString("b", a3-780+900,b3-510+650);
//  g.drawString("h", a3-780+935,b3-510+650);
//  g.drawString("w", a3-780+850,b3-510+820-h);
//  g.drawString("B", a3-780+860,b3-510+520);
//  g.drawString("A", a3-780+790,b3-510+780-h);

//  g.drawRect(a6-780+780, b6-510+510, 150,300-h);//back small lc
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawRect(a6-780+810, b6-510+530, 100,250-h+10);//back small lc
//  g.setColor(Color.blue);  //设置画笔颜色 
//  g.drawLine(a6-780+850, b6-510+510, a6-780+850, b6-510+530);//A
//  g.drawLine(a6-780+780, b6-510+770-h, a6-780+810, b6-510+770-h);//B
//  g.drawString("冷藏室背面蒸发器 ", a6-780+810,b6-510+640-h);
//  g.drawString("A=", a6-780+800-15,b6-510+840-h);
//  g.drawString(dg.format(vip.A2bsmall)+"mm", a6-780+815-15,b6-510+840-h);
//  g.drawString("w=", a6-780+800-15,b6-510+860-h);
//  g.drawString(vip.w2bsmall+"mm", a6-780+815-15,b6-510+860-h);
//  g.drawString("h=", a6-780+880-15,b6-510+860-h);
//  g.drawString(vip.h2bsmall+"mm", a6-780+895-15,b6-510+860-h);
//  g.drawString("B=", a6-780+880-15,b6-510+840-h);
//  g.drawString(vip.B2bsmall+"mm", a6-780+895-15,b6-510+840-h);
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawString("a=", a6-780+800-15,b6-510+880-h);
//  g.drawString(vip.a2bsmall+"mm", a6-780+815-15,b6-510+880-h);
//  g.drawString("b=", a6-780+880-15,b6-510+880-h);
//  g.drawString(vip.b2bsmall+"mm", a6-780+895-15,b6-510+880-h);
//  g.setColor(Color.blue);  //设置画笔颜色 
//  g.drawString("a", a6-780+850,b6-510+775-h);
//  g.drawString("b", a6-780+900,b6-510+650);
//  g.drawString("h", a6-780+935,b6-510+650);
//  g.drawString("w", a6-780+850,b6-510+820-h);
//  g.drawString("B", a6-780+860,b6-510+520);
//  g.drawString("A", a6-780+790,b6-510+780-h);
//  
//  g.drawRect(a1, b1, 150, 300-h);//1eft lc
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawRect(a1+20, b1+20, 100, 250-h+10);//1eft lc  
//  g.setColor(Color.blue);  //设置画笔颜色 
//  g.drawString("冷藏室左侧面", a1-120+158,b1-510+640-h);
//  g.drawString("A=", a1-120+155-30,b1-510+840-h); 
//  g.drawString(vip.A2l+"mm", a1-120+172-30,b1-510+840-h);
//  g.drawString("B=", a1-120+230-30,b1-510+840-h);  
//  g.drawString(vip.B2l+"mm", a1-120+245-30,b1-510+840-h);  
//  g.drawString("w=", a1-120+155-30,b1-510+860-h);
//  g.drawString(vip.w2l+"mm", a1-120+170-30,b1-510+860-h);
//  g.drawString("h=", a1-120+230-30,b1-510+860-h);   
//  g.drawString(vip.h2l+"mm", a1-120+245-30,b1-510+860-h);  
//  g.drawLine(a1-120+120, b1-510+770-h, a1-120+140, b1-510+770-h);
//  g.drawLine(a1-120+190, b1-510+510, a1-120+190, b1-510+530);//B
//  g.drawString("a", a1+60,b1-510+775-h);
//  g.drawString("w", a1+60,b1-510+820-h);
//  g.drawString("A", a1+10,b1-510+780-h);
//  g.drawString("B", a1+80,b1-510+520-h);
//  g.drawString("b", a1+110,b1-510+650-h);
//  g.drawString("h", a1+155,b1-510+650-h);  
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawString("a=", a1-120+155-30,b1-510+880-h);
//  g.drawString(vip.a2l+"mm", a1-120+170-30,b1-510+880-h);
//  g.drawString("b=", a1-120+230-30,b1-510+880-h);
//  g.drawString(vip.b2l+"mm", a1-120+245-30,b1-510+880-h);
//  g.setColor(Color.blue); 
//  
//  g.drawRect(a2, b2, 150, 300-h);//right lc
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawRect(a2-560+590, b2-510+530, 100, 250-h+10);//right lc
//  g.setColor(Color.blue);  //设置画笔颜色 
//  g.drawLine(a2-560+710, b2-510+770-h, a2-560+690, b2-510+770-h);//A
//  g.drawLine(a2-560+630, b2-510+510, a2-560+630, b2-510+530);//B
////  g.drawString("冷藏室右侧面  （尺寸同左侧面）", 560,840);
//  g.drawString("冷藏室右侧面 ", a2-560+608,b2-510+640-h);
//  g.drawString("A=", a2-560+605-30-15,b2-510+840-h); 
//  g.drawString(vip.A2r+"mm", a2-560+622-30-15,b2-510+840-h);
//  g.drawString("B=", a2-560+680-30-15,b2-510+840-h);  
//  g.drawString(vip.B2r+"mm", a2-560+695-30-15,b2-510+840-h);  
//  g.drawString("w=", a2-560+605-30-15,b2-510+860-h);
//  g.drawString(vip.w2r+"mm", a2-560+620-30-15,b2-510+860-h);
//  g.drawString("h=", a2-560+680-30-15,b2-510+860-h);   
//  g.drawString(vip.h2r+"mm", a2-560+695-30-15,b2-510+860-h); 
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawString("a=", a2-560+605-30-15,b2-510+880-h);
//  g.drawString(vip.a2r+"mm", a2-560+620-30-15,b2-510+880-h);
//  g.drawString("b=", a2-560+680-30-15,b2-510+880-h);
//  g.drawString(vip.b2r+"mm", a2-560+695-30-15,b2-510+880-h);
//  g.setColor(Color.blue);  //设置画笔颜色 
//  g.drawString("a", a2-560+630,b2-510+775-h);
//  g.drawString("w", a2-560+630,b2-510+820-h);
//  g.drawString("A", a2-560+695,b2-510+780-h);
//  g.drawString("b", a2-560+680,b2-510+650);
//  g.drawString("B", a2-560+640,b2-510+520);
//  g.drawString("h", a2-560+715,b2-510+650);  

  g.drawRect(a4, b4, 150, 300-h);//left door lc
  g.setColor(Color.red);  //设置画笔颜色 
  g.drawRect(a4-780+810, b4-110+130, 100, 250-h+10);//left door lc
  g.setColor(Color.blue);  //设置画笔颜色 
  g.drawLine(a4-780+850, b4-110+110, a4-780+850, b4-110+130);//A
  g.drawLine(a4-780+780, b4-110+370-h, a4-780+810, b4-110+370-h);//B
  g.drawString("冷藏室左门 ", a4-780+830,b4-110+240-h);
  g.drawString("A=", a4-780+800-15,b4-110+440-h);
  g.drawString(di.format(vip.A2ld)+"mm", a4-780+815-15,b4-110+440-h);
  g.drawString("w=", a4-780+800-15,b4-110+460-h);
  g.drawString(di.format(vip.w2ld)+"mm", a4-780+815-15,b4-110+460-h);
  g.drawString("h=", a4-780+880-15,b4-110+460-h);
  g.drawString(di.format(vip.h2ld)+"mm", a4-780+895-15,b4-110+460-h);
  g.drawString("B=", a4-780+880-15,b4-110+440-h);
  g.drawString(di.format(vip.B2ld)+"mm", a4-780+895-15,b4-110+440-h);
  g.setColor(Color.red);  //设置画笔颜色 
  g.drawString("a=", a4-780+800-15,b4-110+480-h);
  g.drawString(di.format(vip.a2ld)+"mm", a4-780+815-15,b4-110+480-h);
  g.drawString("b=", a4-780+880-15,b4-110+480-h);
  g.drawString(di.format(vip.b2ld)+"mm", a4-780+895-15,b4-110+480-h);
  g.setColor(Color.blue);  //设置画笔颜色 
  g.drawString("a", a4-780+850,b4-110+375-h);
  g.drawString("b", a4-780+900,b4-110+250);
  g.drawString("h", a4-780+935,b4-110+250);
  g.drawString("w", a4-780+850,b4-110+420-h);
  g.drawString("B", a4-780+860,b4-110+120);
  g.drawString("A", a4-780+790,b4-110+380-h);

//  g.drawRect(a5, b5, 150, 300-h);//right door lc
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawRect(a5-780+810, b5-110+130, 100, 250-h+10);//right door lc
//  g.setColor(Color.blue);  //设置画笔颜色 
//  g.drawLine(a5-780+850, b5-110+110, a5-780+850, b5-110+130);//A
//  g.drawLine(a5-780+780, b5-110+370-h, a5-780+810, b5-110+370-h);//B
//  g.drawString("冷藏室右门 ", a5-780+830,b5-110+240);
//  g.drawString("A=", a5-780+800-15,b5-110+440-h); 
//  g.drawString(dg.format(vip.A2rd)+"mm", a5-780+815-15,b5-110+440-h); 
//  g.drawString("w=", a5-780+800-15,b5-110+460-h);
//  g.drawString(vip.w2rd+"mm", a5-780+815-15,b5-110+460-h);
//  g.drawString("h=", a5-780+880-15,b5-110+460-h);
//  g.drawString(vip.h2rd+"mm", a5-780+895-15,b5-110+460-h);
//  g.drawString("B=", a5-780+880-15,b5-110+440-h);
//  g.drawString(vip.B2rd+"mm", a5-780+895-15,b5-110+440-h);
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawString("a=", a5-780+800-15,b5-110+480-h);
//  g.drawString(vip.a2rd+"mm", a5-780+815-15,b5-110+480-h);
//  g.drawString("b=", a5-780+880-15,b5-110+480-h);
//  g.drawString(vip.b2rd+"mm", a5-780+895-15,b5-110+480-h);
//  g.setColor(Color.blue);  //设置画笔颜色 
//  g.drawString("a", a5-780+850,b5-110+375-h);
//  g.drawString("b", a5-780+900,b5-110+250);
//  g.drawString("h", a5-780+935,b5-110+250);
//  g.drawString("w", a5-780+850,b5-110+420-h);
//  g.drawString("B", a5-780+860,b5-110+120);
//  g.drawString("A", a5-780+790,b5-110+380-h);
//  
//  /*****************************冷冻室******************冷冻室**********************************冷冻室****************************************/
//  g.drawRect(A3, B3, 150, 300-h);//back ld
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawRect(A3-780+810, B3-110+130, 100, 250-h+10);//back ld
//  g.setColor(Color.blue);  //设置画笔颜色 
//  g.drawLine(A3-780+850, B3-110+110, A3-780+850, B3-110+130);//A
//  g.drawLine(A3-780+780, B3-110+370-h, A3-780+810, B3-110+370-h);//B
////  g.drawLine(910, 770, 930, 770);//C
////  g.drawLine(850, 780, 850, 810);//D
//  g.drawString("冷冻室背面 ", A3-780+730+100,B3-110+440-200-h);
//  g.drawString("A=", A3-780+800-15,B3-110+440-h); 
//  g.drawString(dg.format(vip.A1b)+"mm", A3-780+815-15,B3-110+440-h); 
//  g.drawString("w=", A3-780+800-15,B3-110+460-h);
//  g.drawString(vip.w1b+"mm", A3-780+815-15,B3-110+460-h);
//  g.drawString("h=", A3-780+880-15,B3-110+460-h);
//  g.drawString(vip.h1b+"mm", A3-780+895-15,B3-110+460-h);
//  g.drawString("B=", A3-780+880-15,B3-110+440-h);
//  g.drawString(vip.B1b+"mm", A3-780+895-15,B3-110+440-h);
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawString("a=", A3-780+800-15,B3-110+480-h);
//  g.drawString(vip.a1b+"mm", A3-780+815-15,B3-110+480-h);
//  g.drawString("b=", A3-780+880-15,B3-110+480-h);
//  g.drawString(vip.b1b+"mm", A3-780+895-15,B3-110+480-h);
//  g.setColor(Color.blue);  //设置画笔颜色 
//  g.drawString("a", A3-780+850,B3-110+375-h);
//  g.drawString("b", A3-780+900,B3-110+250);
//  g.drawString("h", A3-780+935,B3-110+250);
//  g.drawString("w", A3-780+850,B3-110+420-h);
//  g.drawString("B", A3-780+860,B3-110+120);
//  g.drawString("A", A3-780+790,B3-110+380-h);

//  g.drawRect(A5, B5, 150, 300-h);//left door ld
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawRect(A5-780+810, B5-110+130, 100, 250-h+10);//left door ld
//  g.setColor(Color.blue);  //设置画笔颜色 
//  g.drawLine(A5-780+850, B5-110+110, A5-780+850, B5-110+130);//A
//  g.drawLine(A5-780+780, B5-110+370-h, A5-780+810, B5-110+370-h);//B
//  g.drawString("冷冻室左门 ", A5-780+830,B5-110+240-h);
//  g.drawString("A=", A5-780+800,B5-110+440-h); 
//  g.drawString(dg.format(vip.A1ld)+"mm", A5-780+815,B5-110+440-h); 
//  g.drawString("w=", A5-780+800,B5-110+460-h);
//  g.drawString(vip.w1ld+"mm", A5-780+815,B5-110+460-h);
//  g.drawString("h=", A5-780+880,B5-110+460-h);
//  g.drawString(vip.h1ld+"mm", A5-780+895,B5-110+460-h);
//  g.drawString("B=", A5-780+880,B5-110+440-h);
//  g.drawString(vip.B1ld+"mm", A5-780+895,B5-110+440-h);
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawString("a=", A5-780+800,B5-110+480-h);
//  g.drawString(vip.a1ld+"mm", A5-780+815,B5-110+480-h);
//  g.drawString("b=", A5-780+880,B5-110+480-h);
//  g.drawString(vip.b1ld+"mm", A5-780+895,B5-110+480-h);
//  g.setColor(Color.blue);  //设置画笔颜色 
//  g.drawString("a", A5-780+850,B5-110+375-h);
//  g.drawString("b", A5-780+900,B5-110+250);
//  g.drawString("h", A5-780+935,B5-110+250);
//  g.drawString("w", A5-780+850,B5-110+420-h);
//  g.drawString("B", A5-780+860,B5-110+120);
//  g.drawString("A", A5-780+790,B5-110+380-h);
//  
//  
//  g.drawRect(A6, B6, 150, 300-h);//right door ld
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawRect(A6-780+810, B6-110+130, 100, 250-h+10);//right door ld
//  g.setColor(Color.blue);  //设置画笔颜色 
//  g.drawLine(A6-780+850, B6-110+110, A6-780+850, B6-110+130);//A
//  g.drawLine(A6-780+780, B6-110+370-h, A6-780+810, B6-110+370-h);//B
////  g.drawLine(910, 770, 930, 770);//C
////  g.drawLine(850, 780, 850, 810);//D
//  g.drawString("冷冻室右门 ", A6-780+830,B6-110+240-h);
//  g.drawString("A=", A6-780+800-15,B6-110+440-h); 
//  g.drawString(dg.format(vip.A1rd)+"mm", A6-780+815-15,B6-110+440-h); 
//  g.drawString("w=", A6-780+800-15,B6-110+460-h);
//  g.drawString(vip.w1rd+"mm", A6-780+815-15,B6-110+460-h);
//  g.drawString("h=", A6-780+880-15,B6-110+460-h);
//  g.drawString(vip.h1rd+"mm", A6-780+895-15,B6-110+460-h);
//  g.drawString("B=", A6-780+880-15,B6-110+440-h);
//  g.drawString(vip.B1rd+"mm", A6-780+895-15,B6-110+440-h);
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawString("a=", A6-780+800-15,B6-110+480-h);
//  g.drawString(vip.a1rd+"mm", A6-780+815-15,B6-110+480-h);
//  g.drawString("b=", A6-780+880-15,B6-110+480-h);
//  g.drawString(vip.b1rd+"mm", A6-780+895-15,B6-110+480-h);
//  g.setColor(Color.blue);  //设置画笔颜色 
//  g.drawString("a", A6-780+850,B6-110+375-h);
//  g.drawString("b", A6-780+900,B6-110+250);
//  g.drawString("h", A6-780+935,B6-110+250);
//  g.drawString("w", A6-780+850,B6-110+420-h);
//  g.drawString("B", A6-780+860,B6-110+120);
//  g.drawString("A", A6-780+790,B6-110+380-h);

//  g.drawRect(A1,B1, 150, 300-h);//1eft ld
//  g.drawRect(A1, B1-110+360-h, 50, 50);//1eft ld
//   
//  g.drawString("冷冻室左侧面", A1-120+178-20,B1-110+240-h);
//  g.drawString("A=", A1-120+155-30,B1-110+440-h); 
//  g.drawString(vip.A1l+"mm", A1-120+172-30,B1-110+440-h);
//  g.drawString("B=", A1-120+230-30,B1-110+440-h);  
//  g.drawString(vip.B1l+"mm", A1-120+250-30,B1-110+440-h);  
//  g.drawString("w=", A1-120+155-30,B1-110+460-h);
//  g.drawString(vip.w1l+"mm", A1-120+170-30,B1-110+460-h);
//  g.drawString("h=", A1-120+230-30,B1-110+460-h);
//  g.drawString(vip.h1l+"mm", A1-120+250-30,B1-110+460-h);
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawString("a=", A1-120+155-30,B1-110+480-h);
//  g.drawString(vip.a1l+"mm", A1-120+170-30,B1-110+480-h);
//  g.drawString("b=", A1-120+230-30,B1-110+480-h);
//  g.drawString(vip.b1l+"mm", A1-120+250-30,B1-110+480-h);  
//  g.drawString("a1=", A1-120+150-30,B1-110+500-h);
//  g.drawString(vip.a1ldown+"mm", A1-120+170-30,B1-110+500-h);
//  g.drawString("b1=", A1-120+230-30,B1-110+500-h);
//  g.drawString(vip.b1ldown+"mm", A1-120+250-30,B1-110+500-h);
//  g.setColor(Color.blue);  //设置画笔颜色 
//  g.drawString("a", A1-120+170,B1-110+135-h);
//  g.drawString("w", A1-120+180,B1-110+420-h);
//  g.drawString("A", A1-120+125,B1-110+280-h);
//  g.drawString("B", A1-120+200,B1-110+120);
//  g.drawString("b", A1-120+140,B1-110+200);
//  g.drawString("h", A1-120+275,B1-110+250);
//  g.drawString("a1", A1+95, B1+250-h);
//  g.drawString("b1", A1+75, B1+265);
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawLine(A1-120+120, B1-110+270-h, A1-120+135, B1-110+270-h);// heng 15
//  g.drawLine(A1-120+190, B1-110+110, A1-120+190, B1-110+125);//             shu 15
//  g.drawLine(A1+15, B1+15, A1+135, B1+15);// heng 120
//  g.drawLine(A1+15, B1+15, A1+15, B1+235-h);//                                shu 220
//  g.drawLine(A1+65, B1+235-h, A1+15, B1+235-h);// heng 50
//  g.drawLine(A1+65, B1+235-h, A1+65, B1+285-h);//                            shu 50
//  g.drawLine(A1+135, B1+285-h,  A1+65, B1+285-h);// heng 70
//  g.drawLine(A1+135, B1+285-h, A1+135, B1+15);//                               shu 270
//  g.drawLine(A1+75, B1+235-h, A1+85, B1+235-h);// heng 10
//  g.drawLine(A1+95, B1+235-h, A1+105, B1+235-h);// heng 10
//  g.drawLine(A1+115, B1+235-h, A1+125, B1+235-h);// heng  10
//  g.setColor(Color.blue);  //设置画笔颜色 
//  
//    
//  g.drawRect(A2,B2, 150, 300-h);                                   //right ld
//  g.drawRect(A2, B2-110+360-h, 50, 50);                            //right ld
//  g.drawString("冷冻室右侧面 ", A2-120+158,B2-110+240-h);
//  g.drawString("A=", A2-120+155-30,B2-110+440-h); 
//  g.drawString(vip.A1r+"mm", A2-120+172-30,B2-110+440-h);
//  g.drawString("B=", A2-120+230-30,B2-110+440-h);  
//  g.drawString(vip.B1r+"mm", A2-120+250-30,B2-110+440-h);  
//  g.drawString("w=", A2-120+155-30,B2-110+460-h);
//  g.drawString(vip.w1r+"mm", A2-120+170-30,B2-110+460-h);
//  g.drawString("h=", A2-120+230-30,B2-110+460-h);
//  g.drawString(vip.h1r+"mm", A2-120+250-30,B2-110+460-h);
//  g.setColor(Color.red);  //设置画笔颜色 
//  g.drawString("a=", A2-120+155-30,B2-110+480-h);
//  g.drawString(vip.a1r+"mm", A2-120+170-30,B2-110+480-h);
//  g.drawString("b=", A2-120+230-30,B2-110+480-h);
//  g.drawString(vip.b1r+"mm", A2-120+250-30,B2-110+480-h);  
//  g.drawString("a2=", A2-120+150-30,B2-110+500-h);
//  g.drawString(vip.a1rdown+"mm", A2-120+170-30,B2-110+500-h);
//  g.drawString("b2=", A2-120+230-30,B2-110+500-h);
//  g.drawString(vip.b1rdown+"mm", A2-120+250-30,B2-110+500-h);
//  g.setColor(Color.blue);  //设置画笔颜色 
//  g.drawString("a", A2-120+170,B2-110+135-h);
//  g.drawString("w", A2-120+180,B2-110+420-h);
//  g.drawString("A", A2-120+125,B2-110+280-h);
//  g.drawString("B", A2-120+200,B2-110+120);
//  g.drawString("b", A2-120+140,B2-110+200);
//  g.drawString("h", A2-120+275,B2-110+250);
//  g.drawString("a2", A2+95, B2+250-h);
//  g.drawString("b2", A2+75, B2+265);
//  
//  g.setColor(Color.red);  // 
//  g.drawLine(A2-120+120, B2-110+270-h, A2-120+135, B2-110+270-h);//  heng 15
//  g.drawLine(A2-120+190, B2-110+110, A2-120+190, B2-110+125);           //  shu  15
//  g.drawLine(A2+15, B2+15, A2+135, B2+15);//  heng 120
//  g.drawLine(A2+15, B2+15, A2+15, B2+235-h);                              //  shu 220
//  g.drawLine(A2+65, B2+235-h, A2+15, B2+235-h);//  heng 50
//  g.drawLine(A2+65, B2+235-h, A2+65, B2+285-h);//                                shu 50
//  g.drawLine(A2+135, B2+285-h,  A2+65, B2+285-h);//  heng 70
//  g.drawLine(A2+135, B2+285-h, A2+135, B2+15);//                                shu 260
//  g.drawLine(A2+75, B2+235-h, A2+85, B2+235-h);//  heng 10
//  g.drawLine(A2+95, B2+235-h, A2+105, B2+235-h);//  heng  20 
//  g.drawLine(A2+115, B2+235-h, A2+125, B2+235-h);//  heng  20 
//  g.drawLine(A2+115, B2+235, A2+125, B2+235);//  heng 110
//  g.setColor(Color.blue);  //设置画笔颜色 
//  




  g.drawRect(A4, B4, 150, 300-h);//bottom ld
  g.setColor(Color.red);  //设置画笔颜色 
  g.drawRect(A4-780+810, B4-110+130, 100, 250-h+10);//back ld
  g.setColor(Color.blue);  //设置画笔颜色 
  g.drawLine(A4-780+850, B4-110+110, A4-780+850, B4-110+130);//A
  g.drawLine(A4-780+780, B4-110+370-h, A4-780+810, B4-110+370-h);//B
//  g.drawLine(910, 770, 930, 770);//C
//  g.drawLine(850, 780, 850, 810);//D
  g.drawString("冷冻室底部 ", A4-780+830,B4-110+240-h);
  g.drawString("A=", A4-780+800-15,B4-110+440-h);
  g.drawString(di.format(vip.A1bo)+"mm", A4-780+815-15,B4-110+440-h);
  g.drawString("w=", A4-780+800-15,B4-110+460-h);
  g.drawString(di.format(vip.w1bo)+"mm", A4-780+815-15,B4-110+460-h);
  g.drawString("h=", A4-780+880-15,B4-110+460-h);
  g.drawString(di.format(vip.h1bo)+"mm", A4-780+895-15,B4-110+460-h);
  g.drawString("B=", A4-780+880-15,B4-110+440-h);
  g.drawString(di.format(vip.B1bo)+"mm", A4-780+895-15,B4-110+440-h);
  g.setColor(Color.red);  //设置画笔颜色 
  g.drawString("a=", A4-780+800-15,B4-110+480-h);
  g.drawString(di.format(vip.a1bo)+"mm", A4-780+815-15,B4-110+480-h);
  g.drawString("b=", A4-780+880-15,B4-110+480-h);
  g.drawString(di.format(vip.b1bo)+"mm", A4-780+895-15,B4-110+480-h);
  g.setColor(Color.blue);  //设置画笔颜色 
  g.drawString("a", A4-780+850,B4-110+375-h);
  g.drawString("b", A4-780+900,B4-110+250);
  g.drawString("h", A4-780+935,B4-110+250);
  g.drawString("w", A4-780+850,B4-110+420-h);
  g.drawString("B", A4-780+860,B4-110+120);
  g.drawString("A", A4-780+790,B4-110+380-h);

  g.drawRect(a7, b7, 150, 300-h);//top lc
  g.setColor(Color.red);  //设置画笔颜色 
  g.drawRect(a7-780+810, b7-110+130, 100, 250-h+10);//top lc
  g.setColor(Color.blue);  //设置画笔颜色 
  g.drawLine(a7-780+850, b7-110+110, a7-780+850, b7-110+130);//A
  g.drawLine(a7-780+780, b7-110+370-h, a7-780+810, b7-110+370-h);//B
  g.drawString("冷藏室顶部 ", a7-780+830,b7-110+240-h);
  g.drawString("A=", a7-780+800-15,b7-110+440-h);
  g.drawString(di.format(vip.A2t)+"mm", a7-780+800,b7-110+440-h);
  g.drawString("w=", a7-780+800-15,b7-110+460-h);
  g.drawString(di.format(vip.w2t)+"mm", a7-780+800,b7-110+460-h);
  g.drawString("h=", a7-780+880-15,b7-110+460-h);
  g.drawString(di.format(vip.h2t)+"mm", a7-780+880,b7-110+460-h);
  g.drawString("B=", a7-780+880-15,b7-110+440-h);
  g.drawString(di.format(vip.B2t)+"mm", a7-780+880,b7-110+440-h);
  g.setColor(Color.red);  //设置画笔颜色 
  g.drawString("a=", a7-780+800-15,b7-110+480-h);
  g.drawString(di.format(vip.a2t)+"mm", a7-780+800,b7-110+480-h);
  g.drawString("b=", a7-780+880-15,b7-110+480-h);
  g.drawString(di.format(vip.b2t)+"mm", a7-780+880,b7-110+480-h);
  g.setColor(Color.blue);  //设置画笔颜色 
  g.drawString("a", a7-780+850,b7-110+375-h);
  g.drawString("b", a7-780+900,b7-110+250);
  g.drawString("h", a7-780+935,b7-110+250);
  g.drawString("w", a7-780+850,b7-110+420-h);
  g.drawString("B", a7-780+860,b7-110+120);
  g.drawString("A", a7-780+790,b7-110+380-h);

  if(vip.temp==16){
   g.drawString("16℃的vip效果 ", B,C);
   g.drawString("无vip Q=", B +220,C);
   g.drawString(df.format(vip.P77), B+280,C);
   g.drawString("有vip Q=", B +220,C+15);
   g.drawString(df.format(vip.Q77),B+280,C+15);
   g.drawString("降低Q =", B +220,C+30);
   if(vip.Q78<1 && vip.Q78>=0){
    g.drawString(dg.format(vip.Q78)+"%", B+280,C+30);
   }
   else
   {
    g.drawString(df.format(vip.Q78)+"%", B+280,C+30);
   }
  }else if(vip.temp==32){

   g.drawString("32℃的vip效果 ", B,C);
   g.drawString("无vip Q=", B +220,C);
   g.drawString(df.format(vip.M77), B+280,C);
   g.drawString("有vip Q=", B+220,C+15);
   g.drawString(df.format(vip.N77),B+280,C+15);
   g.drawString("降低Q =", B+220,C+30);
   if(vip.N78<1 && vip.N78>=0){
    g.drawString(dg.format(vip.N78)+"%", B+280,C+30);
   }
   else
   {
    g.drawString(df.format(vip.N78)+"%", B+280,C+30);
   }
  }else if(vip.temp==38){

   g.drawString("38℃的vip效果 ", B,C);
   g.drawString("无vip Q=", B +220,C);
   g.drawString(df.format(vip.S77), B+280,C);
   g.drawString("有vip Q=", B+220,C+15);
   g.drawString(df.format(vip.T77),B+280,C+15);
   g.drawString("降低Q =", B+220,C+30);
   if(vip.T78<1 && vip.T78>=0){
    g.drawString(dg.format(vip.T78)+"%", B+280,C+30);
   }
   else
   {
    g.drawString(df.format(vip.T78)+"%", B+280,C+30);
   }
  }else if(vip.temp==43){

   g.drawString("43℃的vip效果 ", B,C);
   g.drawString("无vip Q=", B +220,C);
   g.drawString(df.format(vip.V77), B+280,C);
   g.drawString("有vip Q=", B+220,C+15);
   g.drawString(df.format(vip.W77),B+280,C+15);
   g.drawString("降低Q =", B+220,C+30);
   if(vip.W78<1 && vip.W78>=0){
    g.drawString(dg.format(vip.W78)+"%", B+280,C+30);
   }
   else
   {
    g.drawString(df.format(vip.W78)+"%", B+280,C+30);
   }
  }

  g.setColor(c);   //用完了 把 颜色设回去
 }
}