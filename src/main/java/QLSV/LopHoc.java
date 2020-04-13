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
    QLDS qldsGVGD = new QLDS();
    QLDS qldsHS = new QLDS();
    ArrayList<HocSinh> hocsinh = new ArrayList<>();
    ArrayList<GiaoVien> giaovienGD = new ArrayList<>();
    GiaoVien GiaoVienCN = new GiaoVien() {};

    public LopHoc() {
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
