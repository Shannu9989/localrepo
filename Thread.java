class Main
{
    public static void main(String[] args)
    {
        ChildThread ct = new ChildThread();  
        //Thread ct = new Thread(new ChildThread());
        //ct.start();
        for(int i=1;i<=100;i++)
           System.out.println("Welcome"+" "+i);
    }
}
class ChildThread extends Thread
{
    public ChildThread()
    {
      start();
    }
    public void run()
    {
       for(int j=1;j<=100;j++)
           System.out.println("Hello"+" "+j);
    }
}