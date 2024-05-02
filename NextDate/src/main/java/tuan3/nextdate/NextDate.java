
package tuan3.nextdate;

/**
 *
 * @author Admin
 */
public class NextDate {
    int day ;
    int month ;
    int year ;
    public NextDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        String s = day + "/" + month + "/" +year;
        return s;
    }
    public int checkyear(int y){
        if(y%4==0) return 1;
        return 0;
    }
    public NextDate nextDate(){
        if(month<1 || month >12 || day < 1 || day > 31 || year<1914 || year > 2020){
            return null;
        }else{
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10:
                    if(day < 31)
                        return new NextDate(day+1, month, year);
                    else
                        return new NextDate(1, month+1, year);
                case 4: case 6: case 9: case 11:
                    if(day < 30)
                        return new NextDate(day+1, month, year);
                    return null;
                case 2:
                    if(day < 27)
                        return new NextDate(day+1, month, year);
                    if(day == 28){
                        if(checkyear(year)==0)
                            return new NextDate(day+1, month, year);
                        else
                             return new NextDate(1, month+1, year);
                    }
                    return null;
                   
                case 12:
                    if(day == 31)
                        return new NextDate(1, 1, year+1);
                    else
                        return new NextDate(day+1, month, year);
                default:
                    return null;
                        
            }
        }
    }
    
}
