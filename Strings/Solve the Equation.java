class Solution {
    public String solveEquation(String equation) {
        String eq[] = equation.split("=");
        int values[][] = new int[2][2];

        for (int j = 0; j < 2; j++) {
            String str = eq[j];
            int[] val = values[j];
            boolean pos = true;
            int temp = 0;
            for (int i = 0; i<str.length(); i++) {
                char c = str.charAt(i) ;
                if (c == 'x') {
                    if(i == 0 || str.charAt(i - 1) == '+' || str.charAt(i - 1) == '-'){
                        val[0] += (pos ? 1 : -1);
                    }
                    else{
                        val[0] += (pos ? 1 : -1)*temp;
                    }
                    temp = 0;
                } else if (c == '+' || c == '-') {
                    val[1] += (pos ? 1 : -1) * temp;
                    temp = 0;
                    pos = c == '+';
                } else {
                    temp = temp * 10 + (c - '0');
                }
            }
            val[1] += (pos ? 1 : -1) * temp;
        }

        int xdiff = values[0][0] - values[1][0];
        int valdiff = values[1][1] - values[0][1];
        if (xdiff == 0) {
            if (valdiff == 0)
                return "Infinite solutions";
            return "No solution";
        }
        return "x=" + valdiff / xdiff;

    }
}