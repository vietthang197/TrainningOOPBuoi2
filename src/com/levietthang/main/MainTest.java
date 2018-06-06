package com.levietthang.main;

import com.levietthang.classes.Circle;
import com.levietthang.classes.Rectangle;
import com.levietthang.classes.Shape;
import com.levietthang.classes.Triangle;
import sun.security.provider.SHA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Object> listShape = new ArrayList<>();
        while (true){
            System.out.println("1. Nhập hình tròn");
            System.out.println("2. Nhập hình chữ nhật");
            System.out.println("3. Nhập hình hình tam giác");
            System.out.println("4. Xuất danh sách các hình");
            System.out.println("5. Số lượng các hình");
            System.out.println("6. Diện tích lớn nhất của các hình theo từng loại");
            System.out.println("");
            System.out.println("-------------------------------------------------------------");

            int control = scanner.nextInt();
            switch (control){
                case 1 :
                    System.out.println("Nhập tọa độ x của tâm :");
                    float x = scanner.nextFloat();
                    System.out.println("Nhập tọa độ y của tâm :");
                    float y = scanner.nextFloat();
                    System.out.println("Nhập màu sắc :");
                    scanner.next();
                    String color = scanner.nextLine();
                    System.out.println("Nhập bán kính :");
                    float radius = scanner.nextFloat();
                    listShape.add(new Circle(x, y, color, radius));
                    System.out.println("********************");
                    break;
                case 2 :
                    System.out.println("Nhập tọa độ x của tâm :");
                    float x1 = scanner.nextFloat();
                    System.out.println("Nhập tọa độ y của tâm :");
                    float y1 = scanner.nextFloat();
                    System.out.println("Nhập màu sắc :");
                    scanner.next();
                    String color1 = scanner.nextLine();
                    System.out.println("Nhập chiều dài :");
                    float width = scanner.nextFloat();
                    System.out.println("Nhập chiều rộng :");
                    float height = scanner.nextFloat();
                    listShape.add(new Rectangle(x1, y1, color1, width, height));
                    System.out.println("********************");
                    break;
                case 3 :
                    System.out.println("Nhập tọa độ x của tâm :");
                    float x2 = scanner.nextFloat();
                    System.out.println("Nhập tọa độ y của tâm :");
                    float y2 = scanner.nextFloat();
                    System.out.println("Nhập màu sắc :");
                    scanner.next();
                    String color2 = scanner.nextLine();
                    System.out.println("Nhập cạnh a :");
                    float a = scanner.nextFloat();
                    System.out.println("Nhập cạnh b :");
                    float b = scanner.nextFloat();
                    System.out.println("Nhập cạnh c :");
                    float c = scanner.nextFloat();
                    listShape.add(new Triangle(x2, y2, color2, a, b, c));
                    System.out.println("********************");
                    break;
                case 4:
                    if(listShape.isEmpty()){
                        System.out.println("Không có hình nào.");
                    }else{
                        System.out.println("Danh sách các hình");
                        for(Object obj : listShape){
                            if(((Shape)obj).getType() == Shape.KEY_CIRCLE){
                                System.out.println(((Circle)obj).toString());
                            }
                            if(((Shape)obj).getType() == Shape.KEY_RECTANGLE){
                                System.out.println(((Rectangle)obj).toString());
                            }
                            if(((Shape)obj).getType() == Shape.KEY_TRIANGLE){
                                System.out.println(((Triangle)obj).toString());
                            }
                        }
                    }
                    System.out.println("********************");
                    break;
                case 5:
                    int numberAllShape = listShape.size();
                    int numCircle =0;
                    int numRectangle =0;
                    int numTriagle =0;
                    for(Object obj : listShape){
                        if(((Shape)obj).getType() == Shape.KEY_CIRCLE){
                            numCircle++;
                        }
                        if(((Shape)obj).getType() == Shape.KEY_RECTANGLE){
                            numRectangle++;
                        }
                        if(((Shape)obj).getType() == Shape.KEY_TRIANGLE){
                            numTriagle++;
                        }
                    }
                    System.out.println("Tổng tất cả có "+numberAllShape+" hình");
                    System.out.println("Trong đó có : "+numCircle+" hình tròn, "+numRectangle+" hình chữ nhật, "+numTriagle+" hình tam giác");
                    System.out.println("********************");
                    break;
                case 6:
                    float maxSCricle =0;
                    float maxSRectangle =0;
                    float maxSTriagle =0;

                    for(Object obj : listShape){
                        switch (((Shape)obj).getType()){
                            case Shape.KEY_RECTANGLE:
                                if(((Rectangle)obj).area() > maxSRectangle) maxSRectangle = ((Rectangle)obj).area();
                                break;
                            case Shape.KEY_CIRCLE:
                                if(((Circle)obj).area() > maxSCricle) maxSCricle = ((Circle)obj).area();
                                break;
                            case Shape.KEY_TRIANGLE:
                                if(((Triangle)obj).area() > maxSTriagle) maxSTriagle = ((Triangle)obj).area();
                                break;
                        }

                    }

                    System.out.println("Diện tích lớn nhất của hình chữ nhật là : "+ maxSRectangle);
                    System.out.println("Diện tích lớn nhất của hình tròn là : "+ maxSCricle);
                    System.out.println("Diện tích lớn nhất của hình tam giác là : "+ maxSTriagle);
                    System.out.println("********************");
                    break;

            }
        }
    }
}
