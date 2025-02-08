/**USE OF LONG DATATYPE*/
// to calculate the distance travelled by the light using long datatype
class LightTravel{
    public static void main(String args[])

    {
int lightspeed;
long days;
long seconds;
long distance;
//approximate speed of light in miles per second is 186000
lightspeed = 186000;
//specify the number of days
days = 1000;
seconds = days*24*60*60;//convert days into seconds;
distance = lightspeed*seconds;
System.out.print("In "+ days);System.out.print(" days");
System.out.print(" The light will travel "+ distance );System.out.print(" miles");


    }

}