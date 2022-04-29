package com.company.entity;

import java.util.Scanner;

public class PhanSo {
    private int ts;
    private int ms;

    public int getTs() {
        return ts;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    public PhanSo() {
        this.ts = Value.TU_SO;
        this.ms = Value.MAU_SO;
    }

    @Override
    public String toString() {
        return "PhanSo{" +
                "ts=" + ts +
                ", ms=" + ms +
                '}';
    }

    public PhanSo(int ts, int ms) {
        this.ts = ts;
        this.ms = ms;
    }

    public void hien() {
        System.out.println(ts + "/" + ms);
    }

    public void nhap() {
        System.out.println("=================Nhập giá trị===============");
        System.out.print("Nhập phân số dạng a/b: ");
        String a = new Scanner(System.in).nextLine();
        int count = a.length();
        String sympol = "/";
        int index = a.indexOf(sympol);
        String first = a.substring(0, (index));
        String second = a.substring(index + 1, count);
        this.setTs(Integer.parseInt(first));
        this.setMs(Integer.parseInt(second));
    }

    public int timUSCLN(int a, int b) {
        if (a < 0) {
            a = -(a);
        } else if (b < 0) {
            b = -(b);
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public PhanSo toiGian() {
        int i = timUSCLN(this.getTs(), this.getMs());
        this.setTs(this.getTs() / i);
        this.setMs(this.getMs() / i);
        PhanSo phanSo = new PhanSo(this.getTs(), this.getMs());
        return phanSo;
    }

    public void cong(PhanSo sp2) {
        int ts = this.getTs() * sp2.getMs() + sp2.getTs() * this.getMs();
        int ms = this.getMs() * sp2.getMs();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.toiGian();
        PhanSo phanSoTongAll = phanSoTong.checkValue();
        if (ts % ms != 0) {
            System.out.println("Tổng hai phân số = " + phanSoTongAll.ts + "/" + phanSoTongAll.ms);
        } else {
            System.out.println("Tổng hai phân số = " + phanSoTongAll.ts / phanSoTongAll.ms);
        }
    }

    public void tru(PhanSo sp2) {
        int ts = (this.getTs() * sp2.getMs()) - (sp2.getTs() * this.getMs());
        int ms = this.getMs() * sp2.getMs();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.toiGian();
        phanSoTong = phanSoTong.checkValue();
        if (ts % ms != 0) {
            System.out.println("Hiệu hai phân số = " + phanSoTong.ts + "/" + phanSoTong.ms);
        } else {
            System.out.println("Hiệu hai phân số = " + phanSoTong.ts / phanSoTong.ms);
        }
    }

    public void nhan(PhanSo sp2) {
        int ts = this.getTs() * sp2.getTs();
        int ms = this.getMs() * sp2.getMs();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.toiGian();
        PhanSo phanSoTongAll = phanSoTong.checkValue();
        if (ts % ms != 0) {
            System.out.println("Tích hai phân số = " + phanSoTongAll.ts + "/" + phanSoTongAll.ms);
        } else {
            System.out.println("Tích hai phân số = " + phanSoTongAll.ts / phanSoTongAll.ms);
        }
    }

    public void chia(PhanSo sp2) {
        int ts = this.getTs() * sp2.getMs();
        int ms = this.getMs() * sp2.getTs();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.toiGian();
        PhanSo phanSoTongAll = phanSoTong.checkValue();
        if (ts % ms != 0) {
            System.out.println("Thương hai phân số = " + phanSoTongAll.ts + "/" + phanSoTongAll.ms);
        } else {
            System.out.println("Thương hai phân số = " + phanSoTongAll.ts / phanSoTongAll.ms);
        }
    }

    public PhanSo ngichDao() {
        int ts = this.getMs();
        int ms = this.getTs();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        System.out.println("Nghịch đảo của phân số " + ms + "/" + ts + " là ");
        //checkValue(phanSoTong);
        System.out.println(phanSoTong.ts + "/" + phanSoTong.ms);
        return phanSoTong;
    }

    public PhanSo checkValue() {
        int ts = this.getTs();
        int ms = this.getMs();
        if (ts < 0 && ms < 0) {
            ts = -(ts);
            ms = -(ms);
        } else if (ms < 0 && ts >= 0) {
            ts = -(ts);
            ms = -(ms);
        } else {
            ts = ts;
            ms = ms;
        }
        PhanSo phanSo = new PhanSo(ts, ms);
        return phanSo;
    }

    public PhanSo doiDau() {
        PhanSo phanSo = new PhanSo(this.getMs(), this.getTs());
        PhanSo phanSo1 = phanSo.checkValue();
        ts = -(phanSo1.ts);
        ms = phanSo1.ms;
        PhanSo phanSo2 = new PhanSo(ts, ms);
        System.out.print("Phân số đổi dấu của " + phanSo1.ts + "/" + phanSo1.ms + " là: ");
        System.out.print(ts + "/" + ms);
        return phanSo2;
    }

    public boolean bangNhau(PhanSo ps2) {
        float value1 = (float) this.getTs() / this.getMs();
        float value2 = (float) ps2.getTs() / ps2.getMs();
        if (value1 == value2)
            return true;
        return false;
    }

    public boolean lonHon(PhanSo ps2) {
        float value1 = (float) this.getTs() / this.getMs();
        float value2 = (float) ps2.getTs() / ps2.getMs();
        if (value1 > value2)
            return true;
        return false;
    }

    public boolean nhoHon(PhanSo ps2) {
        float value1 = (float) this.getTs() / this.getMs();
        float value2 = (float) ps2.getTs() / ps2.getMs();
        if (value1 < value2)
            return true;
        return false;
    }
}