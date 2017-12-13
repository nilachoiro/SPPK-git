/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitas;

/**
 *
 * @author Fadli Hudaya
 */
public class KriteriaLahan {
    
    private String no;
    private String id_kriteria;
    private String id_himpunan;
    private String nama_kriteria;
    private String subkriteria;

    public KriteriaLahan(String no, String id_kriteria, String id_himpunan) {
        this.no = no;
        this.id_kriteria = id_kriteria;
        this.id_himpunan = id_himpunan;
    }

    public KriteriaLahan(String no, String id_kriteria, String id_himpunan, String nama_kriteria, String subkriteria) {
        this.no = no;
        this.id_kriteria = id_kriteria;
        this.id_himpunan = id_himpunan;
        this.nama_kriteria = nama_kriteria;
        this.subkriteria = subkriteria;
    }

    public String getNama_kriteria() {
        return nama_kriteria;
    }

    public void setNama_kriteria(String nama_kriteria) {
        this.nama_kriteria = nama_kriteria;
    }

    public String getSubkriteria() {
        return subkriteria;
    }

    public void setSubkriteria(String subkriteria) {
        this.subkriteria = subkriteria;
    }
    
    public String getno(){
        return no;
    }

    public String getIdKriteria(){
        return id_kriteria;
    }

    public String getIdHimpunan(){
        return id_himpunan;
    }

    public void no(String no){
        this.no = no;
    }

    public void setIdKriteria(String id_kriteria){
        this.id_kriteria = id_kriteria;
    }

    public void setIdHimpunan(String id_himpunan){
        this.id_himpunan = id_himpunan;
    }

    public Object getObject(int index){
        switch(index){
            case 0 : return no;
            case 1 : return id_kriteria;
            case 2 : return id_himpunan;
            default : return null;
        }
    }
    
    public Object getObjects(int index){
        switch(index){
            case 0 : return no;
            case 1 : return nama_kriteria;
            case 2 : return subkriteria;
            default : return null;
        }
    }
}
