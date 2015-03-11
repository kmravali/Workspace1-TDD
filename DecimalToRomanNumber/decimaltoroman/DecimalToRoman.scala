package scala.com.tdd.example.decimaltoroman

class DecimalToRoman {

	def getRomanNumber(decimal : Int) : String = {
		var remainder = decimal%10
    var quo = decimal/10
    var place =1
    var result = getRomanvalue(remainder,place);
	   
    while(quo>=1)
    {
      place*=10
      remainder=quo%10
      quo=quo/10
      result=getRomanvalue(remainder,place)+result
    }
    return result
  
  }
  
  def getRomanvalue (rem :Int , place : Int):String ={
    var rnum="";
    if(place==1){ 
      rnum = rem match {
      case 1 =>return "I";
      case 2 =>return "II";
      case 3 =>return "III";
      case 4 =>return "IV";
      case 5 =>return "V";
      case 6 =>return "VI";
      case 7 =>return "VII";
      case 8 =>return "VIII";
      case 9 =>return "IX";
      
      }
    }
    if(place==10){
      rnum = rem match {
      case 1 => return "X";
      case 2 => return "XX";
      case 3 => return "XXX";
      case 4 => return "XL";
      case 5 => return "L";
      case 6 => return "LX";
      case 7 => return "LXX";
      case 8 => return "LXXX";
      case 9 => return "XC";
      
      }
    }
    if(place==100){
      rnum = rem match {
      case 1 => return "C";
      case 2 => return "CC";
      case 3 => return "CCC";
      case 4 => return "CD";
      case 5 => return "D";
      case 6 => return "DC";
      case 7 => return "DCC";
      case 8 => return "DCCC";
      case 9 => return "CC";

      }
    }
    if(place==1000){
     rnum = rem match {
      case 1 => return "M";
      case 2 => return "MM";
      case 3 => return "MMM";

      }
    }   
    return rnum;
  }

}