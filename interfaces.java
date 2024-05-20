class bk implements interfac,m_inh // implement keyword used to inherete multiple classes
{  public void call() //remote method
{ System.out.println("from call");
        }
void display() // local method
{ System.out.println("from display");
}
public void show() // remote method
{System.out.println("from show");
}
}
public class interfaces {
    public static void main(String args[])
    { bk b=new bk();
     b.call();
     b.display();
     b.show();
    }
}
 
// it is necessary to call all function from super  classes to one classes.