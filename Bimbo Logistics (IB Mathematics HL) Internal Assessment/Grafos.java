
public class Grafos {
    public int max;
    public int min;
    public String maxx;
    public String minn;
    public void main(String args[]){
        this.min=1000;
        this.max=100;
        String expendios []= {"A","B","C","D","E","F","G","H","I","J","K"};
        int permutaciones=0;
        for(int a=0; a<expendios.length; a++){
            for(int b=0; b<expendios.length; b++){
            for(int c=0; c<expendios.length; c++){
            for(int d=0; d<expendios.length; d++){
            for(int e=0; e<expendios.length; e++){
            for(int f=0; f<expendios.length; f++){
            for(int g=0; g<expendios.length; g++){
            for(int h=0; h<expendios.length; h++){
            for(int i=0; i<expendios.length; i++){
            for(int j=0; j<expendios.length; j++){
            for(int k=0; k<expendios.length; k++){
            if(a!=b&&a!=c&&a!=d&&a!=e&&a!=f&&a!=g&&a!=h&&a!=i&&a!=j&&a!=k&&
               b!=a&&b!=c&&b!=d&&b!=e&&b!=f&&b!=g&&b!=h&&b!=i&&b!=j&&b!=k&&
               c!=a&&c!=b&&c!=d&&c!=e&&c!=f&&c!=g&&c!=h&&c!=i&&c!=j&&c!=k&&  
               d!=a&&d!=b&&d!=c&&d!=e&&d!=f&&d!=g&&d!=h&&d!=i&&d!=j&&d!=k&&
               e!=a&&e!=b&&e!=c&&e!=d&&e!=f&&e!=g&&e!=h&&e!=i&&e!=j&&e!=k&&
               f!=a&&f!=b&&f!=c&&f!=d&&f!=e&&f!=g&&f!=h&&f!=i&&f!=j&&f!=k&&
               g!=a&&g!=b&&g!=c&&g!=d&&g!=e&&g!=f&&g!=h&&g!=i&&g!=j&&g!=k&&
               h!=a&&h!=b&&h!=c&&h!=d&&h!=e&&h!=f&&h!=g&&h!=i&&h!=j&&h!=k&&
               i!=a&&i!=b&&i!=c&&i!=d&&i!=e&&i!=f&&i!=g&&i!=h&&i!=j&&i!=k&&
               j!=a&&j!=b&&j!=c&&j!=d&&j!=e&&j!=f&&j!=g&&j!=h&&j!=i&&j!=k&&
               k!=a&&k!=b&&k!=c&&k!=d&&k!=e&&k!=f&&k!=g&&k!=h&&k!=j&&k!=i
                    ){permutaciones++;
                String camino = "X"+expendios[a]+expendios[b]+expendios[c]+expendios[d]+
                  expendios[e]+expendios[f]+expendios[g]+expendios[h]+
                        expendios[i]+expendios[j]+expendios[k]+"X ";
                sumarTiempo(camino);
            }
        }
        }
        }
        }
        }
        }
        }
        }
        }
        }
        }System.out.println(permutaciones);
        
    }
    
    public void sumarTiempo(String h){
       int suma=0;
       for (int l=0; l<12; l++){       
       if(h.substring(l, l+2)=="DB"||h.substring(l, l+2)=="DE"||h.substring(l, l+2)=="BC"||h.substring(l,l+2)=="BE"){
           suma=suma+4;
       }
       else if(h.substring(l, l+2)=="AB"||h.substring(l, l+2)=="ED"){
           suma=suma+5;
       }
       else if(h.substring(l, l+2)=="CB"||h.substring(l, l+2)=="CD"||h.substring(l, l+2)=="FG"||h.substring(l, l+2)=="AD"){
           suma=suma+6;
       }
       else if(h.substring(l, l+2)=="EB"){
           suma=suma+7;
       }
       else if(h.substring(l, l+2)=="CE"||h.substring(l, l+2)=="DC"||h.substring(l, l+2)=="AE"||h.substring(l, l+2)=="GF"||h.substring(l, l+2)=="GI"||h.substring(l, l+2)=="AK"||h.substring(l, l+2)=="BA"){
           suma=suma+8;
       }
       else if(h.substring(l, l+2)=="AC"||h.substring(l, l+2)=="BK"){
           suma=suma+9;
       }
       else if(h.substring(l, l+2)=="AX"||h.substring(l, l+2)=="DA"||h.substring(l, l+2)=="GH"||h.substring(l, l+2)=="EF"){
           suma=suma+10;
       }
       else if(h.substring(l, l+2)=="IG"||h.substring(l, l+2)=="EC"){
           suma=suma+11;
       }
       else if(h.substring(l, l+2)=="XA"||h.substring(l, l+2)=="IF"||h.substring(l, l+2)=="FI"||h.substring(l, l+2)=="IJ"||h.substring(l, l+2)=="CK"||h.substring(l, l+2)=="DF"||h.substring(l, l+2)=="JI"||h.substring(l, l+2)=="BX"||h.substring(l, l+2)=="EI"){
           suma=suma+12;
       }
       else if(h.substring(l, l+2)=="CA"||h.substring(l, l+2)=="FH"||h.substring(l, l+2)=="FJ"||h.substring(l, l+2)=="XK"||h.substring(l, l+2)=="DX"||h.substring(l, l+2)=="JX"||h.substring(l, l+2)=="DG"||h.substring(l, l+2)=="JF"||h.substring(l, l+2)=="JG"||h.substring(l, l+2)=="DJ"||h.substring(l, l+2)=="DK"||h.substring(l, l+2)=="KX"||h.substring(l, l+2)=="KA"||h.substring(l, l+2)=="EG"||h.substring(l, l+2)=="HG"||h.substring(l, l+2)=="EK"){
           suma=suma+13;
       }
       else if(h.substring(l, l+2)=="FD"||h.substring(l, l+2)=="FE"||h.substring(l, l+2)=="IH"||h.substring(l, l+2)=="EA"||h.substring(l, l+2)=="KB"||h.substring(l, l+2)=="KD"||h.substring(l, l+2)=="BF"){
           suma=suma+14;
       }
       else if(h.substring(l, l+2)=="XB"||h.substring(l, l+2)=="CG"||h.substring(l, l+2)=="DI"||h.substring(l, l+2)=="HI"){
           suma=suma+15;
       }
        else if(h.substring(l, l+2)=="FB"||h.substring(l, l+2)=="CF"||h.substring(l, l+2)=="XG"||h.substring(l, l+2)=="XJ"||h.substring(l, l+2)=="GJ"||h.substring(l, l+2)=="EX"||h.substring(l, l+2)=="BG"||h.substring(l, l+2)=="BI"||h.substring(l, l+2)=="BJ"||h.substring(l, l+2)=="EJ"){
           suma=suma+16;
       }
       else if(h.substring(l, l+2)=="CX"||h.substring(l, l+2)=="FX"||h.substring(l, l+2)=="ID"||h.substring(l, l+2)=="XF"||h.substring(l, l+2)=="IE"||h.substring(l, l+2)=="AF"||h.substring(l, l+2)=="JK"||h.substring(l, l+2)=="KE"){
           suma=suma+17;
       }
        else if(h.substring(l, l+2)=="IX"||h.substring(l, l+2)=="FA"||h.substring(l, l+2)=="XC"||h.substring(l, l+2)=="IB"||h.substring(l, l+2)=="XD"||h.substring(l, l+2)=="CJ"||h.substring(l, l+2)=="GX"||h.substring(l, l+2)=="JA"||h.substring(l, l+2)=="JB"||h.substring(l, l+2)=="JE"||h.substring(l, l+2)=="AG"||h.substring(l, l+2)=="KC"||h.substring(l, l+2)=="HF"){
           suma=suma+18;
       }
       else if(h.substring(l, l+2)=="XI"||h.substring(l, l+2)=="CI"||h.substring(l, l+2)=="FK"||h.substring(l, l+2)=="EH"){
           suma=suma+19;
       }
       else if(h.substring(l, l+2)=="FC"||h.substring(l, l+2)=="XE"||h.substring(l, l+2)=="GB"||h.substring(l, l+2)=="GD"||h.substring(l, l+2)=="JD"||h.substring(l, l+2)=="AI"||h.substring(l, l+2)=="AJ"||h.substring(l, l+2)=="KJ"){
           suma=suma+20;
       }
       else if(h.substring(l, l+2)=="GE"||h.substring(l, l+2)=="GK"||h.substring(l, l+2)=="KG"){
           suma=suma+21;
       }
       else if(h.substring(l, l+2)=="IA"||h.substring(l, l+2)=="IC"||h.substring(l, l+2)=="CH"||h.substring(l, l+2)=="GA"||h.substring(l, l+2)=="JC"||h.substring(l, l+2)=="DH"||h.substring(l, l+2)=="JH"||h.substring(l, l+2)=="KF"||h.substring(l, l+2)=="BH"||h.substring(l, l+2)=="HJ"){
           suma=suma+22;
       }
        else if(h.substring(l, l+2)=="IK"||h.substring(l, l+2)=="KI"){
           suma=suma+23;
       }
         else if(h.substring(l, l+2)=="GC"||h.substring(l, l+2)=="AH"||h.substring(l, l+2)=="HX"||h.substring(l, l+2)=="HK"){
           suma=suma+25;
       }
        else if(h.substring(l, l+2)=="XH"){
           suma=suma+26;
       }
       else if(h.substring(l, l+2)=="HD"){
           suma=suma+27;
       }
       else if(h.substring(l, l+2)=="HB"||h.substring(l, l+2)=="HE"){
           suma=suma+28;
       }
       else if(h.substring(l, l+2)=="HA"||h.substring(l, l+2)=="HC"){
           suma=suma+30;
       }
       else if(h.substring(l, l+2)=="KH"||h.substring(l, l+2)=="HE"){
           suma=suma+31;
       }
       
    }
    if(suma<this.min){
        this.minn=h;
        this.min=suma;
    }
    if(suma>this.max){
        this.maxx=h;
        this.max=suma;
    }
    
}}
