/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carDetail;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author admin
 */
public class CarDetail implements Serializable {
    private String id, name, brand;
    private int year,amount;
    private double cost;
    private Date ngayNhap,ngayXuat;

    public CarDetail() {
    }

    public CarDetail(String id, String name, String brand, int year, int amount, double cost, Date ngayNhap, Date ngayXuat) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.amount = amount;
        this.cost = cost;
        this.ngayNhap = ngayNhap;
        this.ngayXuat = ngayXuat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        this.ngayXuat = ngayXuat;
    }
}
