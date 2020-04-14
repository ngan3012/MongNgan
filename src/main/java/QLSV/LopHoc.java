/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLSV;
import java.util.ArrayList;
/**
 *
 * @author KetNgan
 */

public class LopHoc {
    QLDS qldsGVGD;
    QLDS qldsHS;
    ArrayList<HocSinh> hocsinh = new ArrayList<>();
    ArrayList<GiaoVien> giaovienGD = new ArrayList<>();
    GiaoVien GiaoVienCN;

    public LopHoc(QLDS qldsGVGD, QLDS qldsHS, GiaoVien GiaoVienCN) {
        this.qldsGVGD = qldsGVGD;
        this.qldsHS = qldsHS;
        this.GiaoVienCN = GiaoVienCN;
    }

    LopHoc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    public int themHocSinh(HocSinh hs){
        qldsHS.them(hs);
        return 1;
    }
    
    public int themGVGD(GiaoVien gv){
       qldsGVGD.them(gv);
       return 1;
    }
    public void inDSHocSinh(){
        qldsHS.InDS();
    }
    
    public void inDSGVGD(){
        qldsGVGD.InDS();
    }
}
