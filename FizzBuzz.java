class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        String temp = new String();
        for(int i = 0; i < n; i++)
        {
            if((i + 1) % 3 == 0)
            {
                if((i + 1) % 5 == 0)
                {
                    list.add("FizzBuzz");
                }
                else
                    list.add("Fizz");
            }
            else if((i + 1) % 5 == 0)
            {
                list.add("Buzz");
            }
            else
            {
                temp = String.valueOf(i + 1);
                list.add(temp);
            }
        }
        return list;
    }
}