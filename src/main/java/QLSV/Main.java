/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLSV;

/**
 *
 * @author KetNgan
 */
public class Main {
    public static void main(String[] args){
       LopHoc lophoc = new LopHoc();
       HocSinh hs1 = new HocSinh("59-cntt-1","IT","Huynh Thi Thuy Hong",21,"Phu Yen","032756143") {};
       HocSinh hs2 = new HocSinh("59-cntt-1","IT","Bui Thi Thanh Nuong",21,"Quang Nam","0325637442") {};
       HocSinh hs3 = new HocSinh("59-cntt-1","IT","Do Thi Thanh Thuy",21,"Phu Yen","0325730014") {};
       GiaoVien gv = new GiaoVien("Mau thiet Ke","IT","Huynh Tuan Anh",41,"Khanh Hoa","032947552") {
           @Override
           public void HienThiTT() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       };
       
       lophoc.themHocSinh(hs1);
       lophoc.themHocSinh(hs2);
       lophoc.themHocSinh(hs3);
       lophoc.themGVGD(gv);
       
       lophoc.qldsHS.xoa("Bui Thi Thanh Nuong");
       lophoc.inDSGVGD();
       lophoc.inDSHocSinh();
    }
}
