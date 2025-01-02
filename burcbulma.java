
import java.util.Scanner;

public class burcbulma {

    public static void main(String[] args) {
        int month, day;
        String burc="";
        boolean isError = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğdunuz ay(Sayısal olarak giriniz): ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();

        /*switch (month) {
            case 1:
                if (day > 0 && day <= 31) {
                    if (day < 22) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (day > 0 && day <= 28) {
                    if (day < 19) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (day > 0 && day <= 31) {
                    if (day < 21) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                } else {
                    isError = true;
                }
                break;
            case 4:
                if (day > 0 && day <= 30) {
                    if (day < 21) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                } else {
                    isError = true;
                }
                break;
            case 5:
                if (day > 0 && day <= 31) {
                    if (day < 22) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                } else {
                    isError = true;
                }
                break;
            case 6:
                if (day > 0 && day <= 30) {
                    if (day < 23) {
                        burc = "İkizler";
                    } else {
                        burc = "Yengeç";
                    }
                } else {
                    isError = true;
                }
                break;
            case 7:
                if (day > 0 && day <= 31) {
                    if (day < 23) {
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    isError = true;
                }
                break;
            case 8:
                if (day > 0 && day <= 31) {
                    if (day < 23) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak";
                    }
                } else {
                    isError = true;
                }
                break;
            case 9:
                if (day > 0 && day <= 30) {
                    if (day < 23) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }
                } else {
                    isError = true;
                }
                break;
            case 10:
                if (day > 0 && day <= 31) {
                    if (day < 23) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                } else {
                    isError = true;
                }
                break;
            case 11:
                if (day > 0 && day <= 30) {
                    if (day < 23) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                } else {
                    isError = true;
                }
                break;
            case 12:
                if (day > 0 && day <= 31) {
                    if (day < 22) {
                        burc = "Yay";
                    } else {
                        burc = "Oğlak";
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
        }*/

        if((month==1 && day<22) || (month==12 && day>22 && day<=31)){
            burc="Oğlak";
        }else if((month==2 && day<20) || (month==1 && day>=22 && day<=31)){
            burc="Kova";
        }else if((month==3 && day<21) || (month==2 && day>=20 && day<=28)) {
            burc="Balık";
        }else if((month==4 && day<21) || (month==3 && day>=21 && day<=31)){
            burc="Koç";
        }else if((month==5 && day<22) || (month==4 && day>=21 && day<=30)){
            burc="Boğa";
        }else if((month==6 && day<23) || (month==5 && day<=22  && day<=31)){
            burc="İkizler";
        }else if((month==7 && day<23) || (month==6 && day>=23 && day<=30)){
            burc="Yengeç";
        }else if((month==8 && day<23) || (month==7 && day>=23 && day<=31)) {
            burc="Aslan";
        }else if((month==9 && day<23) || (month==8 && day>=23 && day<=31)){
            burc="Başak";
        }else if((month==10 && day<23) || (month==9 && day>=23 && day<=30)){
            burc="Terazi";
        }else if((month==11 && day<22) || (month==10 && day<=23  && day<=31)){
            burc="Akrep";
        }else if((month==12 && day<22) || (month==11 && day<=22  && day<=30)){
            burc="Yay";
        }
        else{
            isError=true;
        }

        if(isError){
            System.out.print("Hatalı giriş yaptınız.Lütfen tekrar deneyin");
        }else{
            System.out.print("Burcunuz: "+burc);
        }
        
    }
}
