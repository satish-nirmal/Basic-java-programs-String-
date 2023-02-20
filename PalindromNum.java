
class PalindromNum {

public static void main(String [] args) {

int num = 121;

int rem , rev=0;

int temp = num ;

while(temp>0) {

rem=temp%10;

rev=rev*10+10;

temp=temp/10;
}

if(num==rev) {

System.out.println("This is palindrom Number");

}
else {

System.out.println("This is not Palindrom Number");
}
}
}