class Solution {
    public boolean checksq(char[][] board)
    {
        for(int i=0;i<9;i+=3)
        {
            for(int j=0;j<9;j+=3)
            {
                char[] check = new char[9];
                for(int row=0; row<=2;row++)
                {
                    for(int col =0; col<=2;col++)
                    {
                        if(Character.isDigit(board[i+row][j+col]))
                        {
                            if(check[board[i+row][j+col]-'0'-1]==1)
                                return false;
                            check[board[i+row][j+col]-'0'-1]++;
                        }
                    }   
                }
            }
        }
        return true;
    }
    public boolean checkRow(char[][] board)
    {   
        for(int i=0;i<9;i++)
        {
            char[] check = new char[9];
            for(int j =0;j<9;j++)           
            {
                if(Character.isDigit(board[i][j]))
                {
                    if(check[board[i][j]-'0'-1]==1)
                        return false;
                    check[board[i][j]-'0'-1]++;
                }
            }
        }
        return true;
    }
    public boolean checkCol(char[][] board)
    {
        for(int j =0;j<9;j++)
        {
            char[] check = new char[9];
            for(int i=0;i<9;i++)
            {
                if(Character.isDigit(board[i][j]))
                {
                    if(check[board[i][j]-'0'-1]==1)
                        return false;
                    check[board[i][j]-'0'-1]++;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        if(checkRow(board) == false)
            return false;
        if(checkCol(board) == false)
            return false;
        if(checksq(board)==false)
            return false;
        return true;
    }
}
