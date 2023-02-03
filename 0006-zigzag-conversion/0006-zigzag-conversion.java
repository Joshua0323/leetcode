public class Solution {
    public String convert(String s, int numRows) {
        String[] str = new String[numRows];
        for (int i = 0; i < numRows; i++){
            str[i] = "";
        }
        int row = 0;
        int delta = 1;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            str[row] += c;

            if (row == numRows - 1){
                delta = -1;
            }
            else if (row == 0){
                delta = 1;
            }

            row = row + delta;
            row = Math.max(0, row);
        }
        
        String res = "";
        
        for (int i = 0; i < numRows && s.length() > 0 && numRows < 1001; i++) {
            res += str[i];
        }

        return res;
    }
}

// PAYPALISHIRING
// P IN A LSIG Y AHR P I    0 3 8 12
// PINALSIGY A HRPI         9
// PINA L SIGYAHRPI         4
// P I NAL S IGYA H RP I    1 5 10 13
// PINALS I GYAH R PI       6 
// PINALSIGYAH R PI         11
// PI N ALSI G YAHRPI       2 7

// numRows = 3
// PAHN         0 4 8 12
// APLSIIG      1 3 5 7 9 11
// YIR          2 6 10

// numRows = 4
// 0.PIN          0 6 12          
// 1.ALSIG        1 5 7 11 13
// 2.YAHR         2 4 8 10 
// 3.PI           3 9             


// array[7]
// First line:  [0,3,6]                 int i = 0; i < 250; i=i+3
// Second line: [0,2,3,5,6]     [2,5]   int i = 0; i < 250; i=i+3    int i = 2; i < s.length(); i=i+3
// Third line:  [0,1,3,4]       [1,4]   int i = 0; i < 250; i=i+3    int i = 1; i < s.length(); i=i+3
// Forth line:  [0,3,6]                 int i = 0; i < 250; i=i+3