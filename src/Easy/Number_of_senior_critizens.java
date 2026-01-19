package Easy;

public class Number_of_senior_critizens {

    public static void main(String[] args) {

    }

    public int countSeniors(String[] details) {
        int dem = 0;
        for(String thongTin : details){
            if(Integer.parseInt(thongTin.substring(11, 13)) > 60){
                dem++;
            }
        }
        return dem;
    }
}
