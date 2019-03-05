import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public int rem, digit;
    public String roman = "";

    public static void main(String [] args){
        IntegerToRoman integerToRoman = new IntegerToRoman();
        integerToRoman.convert(50);
    }

    private void convert(int num) {
        if(num < 50 ) {
            while (num > 0) {
                digit++;
                rem = num % 10;
                num = num / 10;
                if (digit == 1) {
                    if (rem > 0 && rem < 4) {
                        while (rem > 0) {
                            roman = "I" + roman;
                            rem--;
                        }
                    } else if (rem > 6 && rem < 9) {
                        roman = "V" + roman;
                        rem = rem - 5;
                        while (rem > 0) {
                            roman = roman + "I";
                            rem--;
                        }
                    } else if (rem == 4) {
                        roman = "IV" + roman;

                    } else if (rem == 5) {
                        roman = "V" + roman;
                    } else if (rem == 9) {
                        roman = "IX" + roman;
                    } else if (rem == 6) {
                        roman = "VI" + roman;
                    }
                }
                // number is less then 4
                if (digit == 2) {
                    if (rem < 4) {
                        if (rem > 0 && rem < 4) {
                            while (rem > 0) {
                                roman = "X" + roman;
                                rem--;
                            }
                        } else if (rem > 6 && rem < 9) {
                            roman = "V" + roman;
                            rem = rem - 5;
                            while (rem > 0) {
                                roman = roman + "I";
                                rem--;
                            }

                        } else if (rem == 4) {
                            roman = "IV" + roman;

                        } else if (rem == 5) {
                            roman = "V" + roman;
                        } else if (rem == 9) {
                            roman = "IX" + roman;
                        } else if (rem == 6) {
                            roman = "VI" + roman;
                        }
                    }
                    if (rem >= 4) {
                        if (rem == 4) {
                            roman = "XL" + roman;
                        } else if (rem > 0 && rem < 4) {
                            while (rem > 0) {
                                roman = "I" + roman;
                                rem--;
                            }
                        } else if (rem > 6 && rem < 9) {
                            roman = "V" + roman;
                            rem = rem - 5;
                            while (rem > 0) {
                                roman = roman + "I";
                                rem--;
                            }

                        } else if (rem == 4) {
                            roman = "IV" + roman;

                        } else if (rem == 5) {
                            roman = "V" + roman;
                        } else if (rem == 9) {
                            roman = "IX" + roman;
                        } else if (rem == 6) {
                            roman = "VI" + roman;
                        }
                    }
                }
            }
        }
        else{
            roman = "L"+ roman ;
        }
        System.out.println("Roman number is = "+ roman);
    }


}
