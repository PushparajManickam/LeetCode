class ExcelColumn {
    public int titleToNumber(String s) {
        int loop, column=0;
        char[] arr = s.toCharArray();
        for(loop=0;loop<arr.length;loop++)
        {
            int temp    = (arr[loop] - 65) + 1;
            column      = column * 26;
            column      = column + temp;
        }
        return column;
    }
}