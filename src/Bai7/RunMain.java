package com.company;

import com.company.entity.PhanSo;

public class RunMain {
    static PhanSo phanso1 = new PhanSo();
    static PhanSo phanso2 = new PhanSo();
    public static void main(String[] args) {
        phanso1.nhap();
        phanso2.nhap();
        //All function
        phanso1.cong(phanso2);
        phanso1.tru(phanso2);
        phanso1.nhan(phanso2);
        phanso1.chia(phanso2);
        compare(phanso1,phanso2);
    }

    private static void compare(PhanSo phanso1, PhanSo phanso2){
        if(phanso1.bangNhau(phanso2)) {
            System.out.print("Hai phân số bằng nhau.");
        }else if(phanso1.lonHon(phanso2)) {
            System.out.println("Phân số thứ nhất lơn hơn phân số thứ 2.");
        }else if(phanso1.nhoHon(phanso2)){
            System.out.println("Phân số thứ nhât nhỏ hơn phân số thứ 2.");
        }
    }
}
