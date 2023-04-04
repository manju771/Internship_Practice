//Music Streaming System: In a music streaming system, there may be a superclass called Song with a method called play() that plays the song's audio. Different types of songs, such as PopSong and JazzSong, may be subclasses of Song and override the play() method to play the song audio in a different way based on their specific genre and style. For example, a PopSong may play the audio with a catchy beat and chorus, while a JazzSong may play the audio with a smooth melody and improvisation.
class song{
  String title;
  String artist;
  int duration;

  public song(String title,String artist,int duration){
    this.title=title;
    this.artist=artist;
    this.duration=duration;
  }
  public String getTitle(){
    return title;
  }
  public String getArtist(){
    return artist;
  }
  public int getDuration(){
    return duration;
  }
  public void play(){
    System.out.println("Playing"+title+"by"+artist+"("+duration+"seconds)");
  }
}
class PopSong extends song{
  PopSong(String title,String artist,int duration){
    super(title,artist,duration);
  }
public void play(){
  Super.play();
  System.out.println("with catchy beat and chorus");
}
}
class JazzSong extends song{
    JazzSong(String title,String artist,int duration){
      super(title,artist,duration);
    }
  public void play(){
    Super.play();
    System.out.println("with smooth melody and improvisation");
  }
}
class Music{
public static void main(String args[]){
song song1=new Song("Song 1","Artist 1",180);
  song1.play();
  PopSong popSong1=new PopSong("Pop Song1","Pop Artist 1",200);
  popSong1.play();
  JazzSong jazzSong1=new JazzSong("Jazz Song 1","Jazz Artist 1",300);
  jazzSong1.play();
}
}