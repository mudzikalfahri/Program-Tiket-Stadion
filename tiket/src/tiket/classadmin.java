
package tiket;


public class classadmin {
    private String[][] dataadmin = new String[2][2];
    private String namaadmin, passadmin;
    
    public classadmin(String namaadmin,String passadmin){
        this.namaadmin = namaadmin;
        this.passadmin = passadmin;
        String[][] dataadmin =
        {
            {"admin","12345"},
            {"fahri","fahri1"}
        };
        this.dataadmin = dataadmin;
        
    }
    public boolean checkadmin(){
        for (int i=0; i<dataadmin.length; i++){
            if (dataadmin[i][0].equals(namaadmin)){
                if (dataadmin[i][1].equals(passadmin)){
                    return true;
                }                
            }
            
        }
        return false;
    }
}
