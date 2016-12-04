package com.example.jellybean.nbatalent;
//Created By Javier Kirksey on Dec. 4th, 2016

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    SearchView oursearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        oursearch= (SearchView) findViewById(R.id.mSearch);
        RecyclerView rv= (RecyclerView) findViewById(R.id.myRecycler);

        //Here we set the properties for our RecyclerView
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setItemAnimator(new DefaultItemAnimator());


        final NBA_Adapter adapter=new NBA_Adapter(this,getPlayers());
        rv.setAdapter(adapter);

        //This is my Search Bar
            oursearch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {

                //FILTER AS YOU TYPE
                adapter.getFilter().filter(query);
                return false;
            }
        });



    }

    //ADD PLAYERS TO ARRAYLIST
    private ArrayList<Player> getPlayers()
    {
        ArrayList<Player> players=new ArrayList<>();
        Player p=new Player();

        //Michael Jordan
        p.setName("Michael Jordan");
        p.setDesc("American basketball star Michael Jordan was born on February 17, 1963, in Brooklyn, " +
                "New York. Jordan left college after his junior year to join the NBA. Drafted by " +
                "the Chicago Bulls, he helped the team make it to the playoffs. For his efforts there " +
                "Jordan received the NBA Rookie of the Year Award. With five regular-season MVPs and three " +
                "All-Star MVPs, Jordan became the most decorated player in the NBA.");
        p.setImg(R.drawable.michael_jordan);
        players.add(p);


        //carmelo_anthony
        p=new Player();
        p.setName("Carmelo Anthony");
        p.setDesc(" In a talent-heavy draft that featured LeBron James and Dwyane Wade, carmelo_anthony," +
                "was selected third overall by the Denver Nuggets. There was little transition period for the young player " +
                "During his 2003-04 rookie season, the 19-year-old Anthony was named to the All-Rookie team, averaging " +
                "21 points and six rebounds per game." +
                "Over the course of his pro career, the 6'8 forward has proven to be one of the game's great scorers. " +
                "In 2007 he was tapped to play in his first All-Star game, and in the ensuing years has made several additional " +
                "All-Star teams. On December 10, 2008, in a game against Minnesota, Anthony tied an NBA record when he scored 33 points in a single quarter. " +
                "While the Nuggets enjoyed a fair level of success with Anthony as the franchise's leading player, the club " +
                "never became the perennial contender that club officials had hoped. In the middle of the 2011 season, Denver " +
                "shipped Anthony to the New York Knicks in a three-team megatrade. " +
                "The move delighted Anthony, who'd longed to return to his native New York, and Knick fans. In New York, Anthony " +
                "has continued his run as one of the NBA's most prolific scorers and helped rejuvenate a franchise that has gone more than four decades without an NBA title. " +
                "In addition to his NBA credentials, Anthony was a key member of both the 2008 and 2012 gold-medal-winning Olympic men's basketball teams.");
        p.setImg(R.drawable.carmelo_anthony);
        players.add(p);


        //Stephen Curry
        p=new Player();
        p.setName("Stephen Curry");
        p.setDesc("Curry proved more than capable of handling the NBA opposition with his shooting and ball-handling " +
                "abilities. The 6'3 guard averaged more than 22 points per game after the 2010 All-Star break, " +
                "and wound up finishing second in the Rookie of the Year balloting. His impressive play earned him " +
                "a spot on the USA Men's Basketball Senior National Team, which won the gold medal at the 2010 World " +
                "Championships. Curry sustained a sprained ankle while practicing with the national team, an injury that lingered for " +
                "the following two seasons. A return to full health allowed him to regain his dazzling form in 2012-13, " +
                "and Curry responded by setting an NBA record with 272 three-pointers. Named the Western Conference Player of the Month " +
                "in April, he followed by leading the Warriors to an upset against the Denver Nuggets in the first round of the playoffs. " +
                "After earning his first All-Star nod in 2014, Curry reached new levels of performance and popularity " +
                "the following season. As one half of the \\\"NBA_SplashScreen Brothers\\\" duo, which also featured sharpshooting guard Klay " +
                "Thompson, Curry led an exciting Warriors team to an early 16-game win streak and was the leading vote-getter for the " +
                "2015 All-Star Game.\\n\" + \"\\n\" + \"Curry went on to set a new record with 286 three-pointers and led the league in " +
                "steals, an impressive all-around display that garnered him the Most Valuable Player Award. He then capped a memorable " +
                "season by helping the Warriors knock off LeBron James and the Cleveland Cavaliers in the NBA Finals, giving the team its first " +
                "championship since 1975.");
        p.setImg(R.drawable.stephen_curry);
        players.add(p);


        //Chris Paul
        p=new Player();
        p.setName("Chris Paul");
        p.setDesc("In 2005, after his sophomore season, Paul declared for the NBA draft, where he was selected fourth overall by the New Orleans Hornets " +
                "in the first round (after Utah's Andrew Bogut, UNC's Marvin Williams and Illinois' Deron Williams). The Atlanta Hawks and Charlotte " +
                "Bobcats also expressed strong interest in adding Paul to their franchises. Paul was assured a starting spot with the struggling Hornets. " +
                "When the devastating Hurricane Katrina hit the New Orleans Gulf Coast area, the team relocated to Oklahoma City to practice and play. " +
                "During his first year in the pros, the Hornets won 38 games and Paul was named the top Western Conference rookie for every " +
                "month of the season. He went on to be named NBA Rookie of the Year. During the 2007-08 season, when the Hornets returned to full-time " +
                "play in New Orleans, Paul's on-court and leadership skills increased, landing him a hoped-for spot in the NBA All-Star Game. " +
                "Paul's consistent high level of play and chemistry with his teammates catapulted the Hornets to a playoff spot, the team's first " +
                "since the 2003-04 season. (They were eventually eliminated by the champion San Antonio Spurs. " +
                "Prior to the start of the 2011-12 season, the Hornets orchestrated a three-way trade deal with the Los Angeles Lakers and Houston " +
                "Rockets that sent Paul to the West Coast. After a negative backlash in New Orleans, the trade was nullified, although Paul eventually " +
                "went to Los Angeles to play for the Clippers.");
        p.setImg(R.drawable.chris_paul);
        players.add(p);

        //Dwayne Wade
        p=new Player();
        p.setName("Dwayne Wade");
        p.setDesc(" \"Wade chose to attend Marquette University in Milwaukee, Wisconsin. Although he was ineligible to play due to low academic scores, " +
                "head coach Tom Crean took him on as a partial qualifier. This meant that although he had to sit out the 2000-01 season, " +
                "he was still allowed to attend school and practice with the team. After taking the time to develop his skills even further, " +
                "he emerged his sophomore year with an average of 17.8 points, 6.6 rebounds and 3.4 assists per game. The team's record that season was 26-7. " +
                "Wade's junior year, he led Marquette to the school's first Conference USA championship, and a return to the Final Four for the " +
                "first time since 1977. He averaged 21.5 points per game, as the team's lead scorer. In the 2003 NCAA Midwest Regional Final. " +
                "Wade recorded the fourth triple-double in NCAA tournament history. His 29 points, 11 rebounds and 11 assists against the top-seeded " +
                "Kentucky Wildcats were publicized by the national press. Wade was even chosen as the MVP of the Midwest Regional Final. Unfortunately, " +
                "his success ended in the Final Four, with a 94-61 loss to the Kansas Jayhawks. " +
                "NBA Career- Due to his newfound fame and success, Wade decided to forgo his senior year and instead enter the 2003 NBA draft. He was selected" +
                "by the Miami Heat, and was picked fifth overall. Wade's first year with the Heat, he averaged 16.2 points, 4.5 assists and 4.0 " +
                "rebounds per game, and was a unanimous selection to the 2004 NBA All-Rookie team. After Shaquille O'Neal was traded to the Heat, " +
                "Wade's numbers increased further, with a new average of 24.1 points and 6.8 assists per game. In the 2006, Wade gave an impressive " +
                "performance in the NBA finals against the Dallas Mavericks. In the third game of the finals, he scored 42 points and made 13 rebounds, " +
                "helping the Heat defeat the Mavericks for a close 98-96 win. His 36 points, 10 rebounds and five assists in the sixth game earned " +
                "him the honor of the NBA finals MVP. " +
                "After a series of operations to repair shoulder and knee injuries, Wade emerged for another strong season in 2008, arguably his best " +
                "season ever with the Heat. Averaging 30.2 points per game, he earned his first NBA scoring title. In 2010, Wade became a free agent for " +
                "the first time, but signed again with the Heat, joining new teammates Chris Bosh and LeBron James. The trio proved to be very strong " +
                "during the 2010-11 season, and although the Miami Heat returned to the NBA finals again, the team lost in six games to the Dallas Mavericks. " +
                "In 2012, the Heat returned to the finals yet again, with a victory. They beat the Oklahoma City Thunder, 121-106, in the fifth " +
                "game of the series—Wade's second NBA Championship win, and the first for some of his teammates, including Chris Bosh and LeBron " +
                "James. The following year, Wade was back in the finals, this time against the San Antonio Spurs. The Heat went on to take the title " +
                "and gave Wade his third NBA Championship win. The Heat met the Spurs for a rematch in the 2014 NBA Finals, but this time a victory " +
                "wasn't in the cards. The Spurs went on to win in five games. The following season, Wade missed playing in the post season after tending " +
                "to a number of injuries. In 2016, back in action, Wade and the Heat made it to the playoffs.");
        p.setImg(R.drawable.dwayne_wade);
        players.add(p);

        //Julius Earving
        p=new Player();
        p.setName("Julius Earving");
        p.setDesc("When the ABA was folded into the NBA in 1976, the cash-strapped Nets sold Erving to the Philadelphia 76ers for $3 million. In Philly, " +
                "Erving quickly helped transform the team into a perennial winner. " +
                "During the 1976-77 season, the 76ers buzzed through the playoffs to reach the NBA Finals, where the team fell to the Portland " +
                "Trail Blazers in six games. After two straight years of reaching the NBA semi-finals, in 1980 Erving returned Philadelphia " +
                "to the Finals, where the club lost to the Los Angeles Lakers and its rookie point guard, Earvin \\\"Magic\\\" Johnson. " +
                "While L.A. got the trophy, Erving nabbed the series' biggest highlight when, in Game 4, he glided past a series of defenders " +
                "in midair, from one end of the hoop to the other, before softly putting the ball in the basket with an underhanded scoop. " +
                "The play subsequently came to be known as the \\\"Baseline Move. " +
                "My mouth just dropped open,\\\" Magic Johnson later recalled. \\\"He actually did that. I thought, 'What should we do? Should we " +
                "take the ball out or should we ask him to do it again?' " +
                "The following season, despite earning MVP honors, Erving did not have enough of a supporting cast to bring his team back to the " +
                "championship round. In 1982, after another heartbreaking loss in the Finals to the Los Angeles Lakers, the 76ers retooled the " +
                "club's lineup, trading for Houston Rocket Moses Malone, for the upcoming season. " +
                "For Erving and his teammates, the 1982-83 season proved nearly flawless. After finishing the regular season with a 65-17 record, " +
                "Philadelphia stormed through the playoffs, losing just once and finishing off the Lakers in the Finals with a four-game sweep. " +
                "The next few years, however, were less successful. With an aging roster, Philadelphia, anchored by forward Charles Barkley, " +
                "started to transition to a younger club. Following the 1986-87 season, Erving retired. In all he was a member of 11 NBA " +
                "All Star teams and played in more than 800 games. Between his NBA and ABA stints, Erving scored more than 30,000 points during his career. " +
                "In 1993 he was elected to the Naismith Memorial Basketball Hall of Fame.");
        p.setImg(R.drawable.julius_earving);
        players.add(p);
        p=new Player();

        //
        p.setName("kevin Durant");
        p.setDesc("After just one year of college basketball, Durant declared himself eligible for the 2007 NBA Draft. In June of that year, he was chosen second " +
                "overall in the first round by the Seattle SuperSonics. Around that same time, Durant signed a $60 million, seven-year endorsement deal " +
                "with Nike, a major deal at the time, exceeded only by LeBron James's Nike contract. " +
                "In his rookie season, Durant was selected as a member of the NBA's All-Rookie First Team and was named the NBA's \\\"Rookie of the Year. " +
                "After the 2007-08 season, the Seattle SuperSonics relocated the organization from Seattle, Washington to Oklahoma City, Oklahoma, becoming " +
                "the Oklahoma City Thunder. Durant continues to thrive with the franchise, having been named an NBA All-Star three times (2010-12) and to the " +
                "All-NBA First Team three times (2010-12). He also led the league three times as NBA scoring champion (2010-12), becoming only the eighth player in NBA history to do so. " +
                "Durant has also played internationally, and was named 2010 FIBA World Championship MVP by the International Basketball Federation. Additionally, " +
                "he was chosen to play with the 2012 U.S. Olympic basketball team. At the 2012 Olympic Games in London, the U.S. basketball team took home the gold medal. " +
                "On July 4, 2016, Durant made big waves in the NBA when he announced that he had agreed to sign with the Golden State Warriors. \\\"The primary " +
                "mandate I had for myself in making this decision was to have it based on the potential for my growth as a player — as that has always steered me in the right direction, " +
                "Durant wrote in a post on The Players' Tribune. \\\"But I am also at a point in my life where it is of equal importance to find an opportunity that " +
                "encourages my evolution as a man: moving out of my comfort zone to a new city and community which offers the greatest potential for my contribution and personal growth.");
        p.setImg(R.drawable.kevin_durant);
        players.add(p);

        //
        p=new Player();
        p.setName("Kobe Bryant");
        p.setDesc("  \"In his second season as guard, with the Lakers, Bryant was voted a starter for the 1998 All-Star Game, becoming at 19 the youngest All-Star in NBA history. He then " +
                "teamed up with superstar center Shaquille O'Neal to win three consecutive NBA championships, and was voted first-team all-NBA from 2002-04. He also inked multi-year " +
                "endorsement deals with Adidas, Sprite and other top sponsors. " +
                "Although the Lakers struggled after O'Neal left in 2004, Bryant performed brilliantly. He scored 81 points against the Toronto Raptors in January 2006, the " +
                "second-highest single-game mark in NBA history, and led the league in scoring that year and the next." +
                "In 2008, Bryant was named Most Valuable Player and carried his team to the NBA Finals, where they lost to the Boston Celtics. In the 2009 NBA Finals, the Lakers " +
                "beat the Orlando Magic to win the championship. Shortly afterward, Bryant was part of the memorial service to honor friend and music superstar Michael Jackson. " +
                "The following year, the Lakers won their second straight title by defeating the Celtics. " +
                "Bryant played on both the 2008 and 2012 U.S. Olympic teams, winning consecutive gold medals with teammates Kevin Durant, LeBron James and carmelo_anthony, among " +
                "several other top players. " +
                "After suffering a torn Achilles tendon in April 2013, Bryant worked hard to return to the court before fracturing his knee just six games into the 2013-14 season. " +
                "The veteran All-Star surpassed Michael Jordan for third all-time on the NBA scoring list in December 2014, but his season ended due to injury for the third straight " +
                "year when he sustained a torn rotator cuff in January 2015. " +
                "Although Bryant returned in time for the start of the 2015-16 NBA season, he personally struggled alongside his young Lakers teammates. In November 2015, " +
                "he announced that he would retire at the end of the season. 'This season is all I have left to give,  he wrote on The Players' Tribune website. " +
                "My heart can take the pounding. My mind can handle the grind but my body knows it's time to say goodbye. " +
                "The announcement drew a strong reaction, particularly from NBA Commissioner Adam Silver. With 17 NBA All-Star selections, an NBA MVP, five NBA championships" +
                " with the Lakers, two Olympic gold medals and a relentless work ethic, Kobe Bryant is one of the greatest players in the history of our game. Silver said in a statement Whether " +
                "competing in the finals or hoisting jump shots after midnight in an empty gym, Kobe has an unconditional love for the game. " +
                "On April 13, 2016, Bryant dazzled a sold-out crowd at the Staples Center and fans everywhere in the last game of his career, scoring 60 points and leading " +
                "the Lakers to a win against the Utah Jazz. It was Bryant’s sixth 60-point game of his career " +
                "After the game, Bryant spoke to the crowd. 'I can't believe how fast 20 years went by...,' he said." +
                "This is absolutely crazy ... and to be standing at center" +
                "court with you guys, my teammates behind me, appreciating the journey that we've been on — we've been through our ups, been through our downs. I think the " +
                "most important part is we all stayed together throughout. " +
                "An all-star lineup of Laker icons also payed tribute to Bryant including Shaquille O’Neal, Phil Jackson, Pau Gasol, Derek Fisher, Lamar Odom and Magic Johnson." +
                "“We are here to celebrate greatness for 20 years,” Johnson said. “Excellence for 20 years. Kobe Bryant has never cheated the game, never cheated us as the fans. He has " +
                "played through injury, he has played hurt. And we have five championship banners to show for it.");
        p.setImg(R.drawable.kobe_bryant);
        players.add(p);

        //
        p=new Player();
        p.setName("LeBron James");
        p.setDesc("At the culmination of the 2013-14 season, Miami returned to the NBA Finals to face off against the Spurs again, this time losing to " +
                "San Antonio after five games. In July of 2014, after opting out of his contract with the Heat and considering other teams, " +
                "James announced that he would be returning to the Cavaliers. " +
                "Hampered by back and knee problems, James missed 13 of 82 regular-season games in 2014-15. However, he was as dominant as ever when healthy,averaging " +
                "25.3 points and 7.4 assists per game. James led the Cavaliers to the NBA Finals, becoming the first player in nearly 50 years " +
                "to reach the championship round in five consecutive seasons. However, injuries to star teammates Kevin Love and Kyrie Irving damaged his " +
                "hopes of claiming a third title, and the Cavaliers lost to the Golden State Warriors in six games. " +
                "The following year, the Cavs overcame the distraction of a midseason coaching change and breezed through the playoffs to earn a rematch with the " +
                "Warriors, marking the sixth straight NBA Finals appearance for King James. In perhaps the crowning achievement of his career, he led his team " +
                "back from a 3-1 deficit, scoring 41 points in both Games 5 and 6, before recording a triple double in Game 7 to give the Cavs their first " +
                "championship in franchise history. " +
                "Voted Finals MVP, James said, I came back to bring a championship to our city. I knew what I was capable of doing. I knew what I learned in the " +
                "last couple years that I was gone, and I knew if I had to—when I came back—I knew I had the right ingredients and the right blueprint " +
                "to help this franchise get back to a place that we've never been. That's what it was all about.");
        p.setImg(R.drawable.lebron_james);
        players.add(p);

        //
        p=new Player();
        p.setName("Allen Iverson");
        p.setDesc("Iverson quickly became one of the NBA's must-see spectacles. Barely 6 feet tall, he blew past defenders with his blinding speed and fearlessly attacked " +
                "the much larger players guarding the basket. With an average of 23.5 points and more than two steals per game, he was named the NBA Rookie of the Year. " +
                "He also became one of the league's most polarizing players. Critics pointed to his missed shots and turnovers, and wondered why, as a point " +
                "guard, he wasn't passing the ball to his teammates. To some, he became a symbol of everything that was wrong with the NBA, his selfish " +
                "play marking the demise of fundamental basketball, and his tattoos and cornrows celebrating its proliferation of street culture. Iverson " +
                "embraced that image by releasing the rap single '40 Bars' in 2000, and bolstered it with his arrests in 1997, on misdemeanor marijuana " +
                "and gun charges, and in 2002, on more serious gun charges (that were eventually dropped). " +
                "But there was no denying the breathtaking talent. Iverson led the league in scoring for the first time in 1998-99, and earned his first " +
                "All-Star selection the following year. Having moved to the shooting guard position, he averaged an NBA-best 31.1 points per game and was named " +
                "the league's MVP in 2000-01, capping the season with a spirited effort in the NBA Finals against the powerful Los Angeles Lakers. At the " +
                "end of the year, he signed a lifetime contract with Reebok. " +
                "Iverson continued to both amaze and frustrate his fans. He led the league in scoring and steals for the second consecutive season in 2001-02, " +
                "before concluding the campaign with a famous rant in which he seemingly mocked the importance of practice. He won another scoring title in " +
                "2004-05 and averaged a career-best 33.0 points per game the following year, but was also sued for an incident in which he failed to stop his " +
                "bodyguard from beating up another man, and was later ordered to pay $260,000 in damages. " +
                "Iverson was traded to the Denver Nuggets in December 2006, and then to the Detroit Pistons in November 2008. He briefly joined the Memphis " +
                "Grizzlies before returning to Philadelphia in January 2010, and played in what would be his final NBA game the following month. An 11-time " +
                "All-Star over his 14 seasons, he led the league in scoring four times and steals three times, and finished with an impressive average of 26.7 points per game.");
        p.setImg(R.drawable.allen_iverson);
        players.add(p);

        //
        p=new Player();
        p.setName("Tim Duncan");
        p.setDesc("Teamed with center David Robinson, who'd missed the 1997 season due to injury, Duncan quickly transformed the Spurs into " +
                "a championship contender. During his rookie year, the power forward averaged 21.1 points and 11.9 rebounds, on his way to winning the NBA's Rookie of the Year award. " +
                "The following year, Duncan proved even more dominant and helped lead the Spurs to the 1999 title, San Antonio's first as a franchise. During the championship series against " +
                "the New York Knicks, Duncan averaged in 27.4 points and 14 rebounds per game to earn the Finals MVP. " +
                "Even as his teammate David Robinson slowed down, Duncan continued to keep the Spurs as perennial contenders. In 2002 and 2003 he was named the NBA's Most Valuable Player, while " +
                "also leading San Antonio to the 2003 title and collecting the Finals MVP award. Three more championships followed, in 2005, 2007 and 2014. " +
                "While his game and personality aren't as splashy as some of his rivals, most notably Shaquille O'Neal, the power forward has earned the respect of coaches and players throughout the NBA. " +
                "He's probably the best player to ever play the position the way he plays it," +
                " former Utah Jazz coach Jerry Sloan has said.Longtime San Antonio coach Gregg Popovich has echoed the sentiment, all the while lauding Duncan for his leadership qualities.He may be a 7-footer, but he's basically a quarterback " +
                "in shorts,he has said.Duncan announced his retirement in July 2016. In his career, he'd completed 19 seasons," +
                " won five championships, was a two-time MVP and played in 15 All-Star games.");
        p.setImg(R.drawable.tim_duncan);
        players.add(p);

        //
        p=new Player();
        p.setName("Russell Westbrooke");
        p.setDesc("Westbrook was named to the NBA All-Rookie First Team after averaging more than 15 points per game in his first season, " +
                "and by his third season he became just the fifth player in league history to accumulate 4,000 points, " +
                "1,500 assists and 1,000 rebounds by that point of his career. Paired with fellow All-Star Kevin Durant, Westbrook helped a young, " +
                "exciting Thunder team reach the 2011 Western Conference Finals. " +
                "The 6'3 point guard averaged 23.6 points per game during the 2011-12 season and led the Thunder to an NBA Finals matchup" +
                " against the Miami Heat. Although billed a showdown between scoring champion Durant and Heat superstar LeBron James, " +
                "Westbrook often stole the show with his explosive drives and tenacious play before Miami pulled away to win in five games " +
                "Later that summer, he earned an Olympic gold medal as a member of the U.S. men's basketball team. " +
                "Westbrook underwent surgery after suffering a torn meniscus during the 2013 playoffs, and a second operation a " +
                "few months later ended his streak of 394 consecutive regular-season games played. Although he returned to the lineup " +
                "early in the 2013-14 NBA season, Westbrook underwent a third operation on the knee at the end of December and missed two more months. " +
                "Following years of criticism that he didn't pass the ball enough as a point guard, Westbrook became his " +
                "team's top scoring option when Durant was sidelined with a foot injury for much of the 2014-15 NBA season. After scoring a " +
                "near-record 41 points to win All-Star MVP honors, Westbrook embarked on an incredible run in which he delivered six triple-doubles " +
                "in eight games. He wound up leading the league with an average of 28.7 points per game, an accomplishment rendered bittersweet when the " +
                "Thunder were eliminated from playoff contention on the final day of the season");
        p.setImg(R.drawable.russell_westbrooke);
        players.add(p);

        //
        p=new Player();
        p.setName("Shaquille O'neal");
        p.setDesc("In his rookie season with the Orlando Magic, Shaquille O'Neal, also known as 'Shaq' finished in the Top 10 in scoring, " +
                "rebounding, blocks and shooting percentage. A notoriously bad free-throw shooter, Shaq focused on trying to get more " +
                "if his points on the power slam, and hearty NBA centers quickly learned to try to foul Shaq rather than give him an easy " +
                "shot. Shaq became the first player in NBA history to be named 'Player of the Week' in his first week in the league. " +
                "In 1996, Shaq signed the biggest contract in NBA history, seven years for $120 million with the Los Angeles Lakers. That same " +
                "year, he helped the United States' Dream Team win gold at the Olympic Games in Atlanta, Georgia."+
                "By the end of the decade, Shaq was a three-time member of the All-NBA Third Team (1994, 1996 and 1997) and a two-time member " +
                "of the All-NBA Second Team (1995 and 1999), and had earned a place on the All-NBA First Team (1998). (After debuting with the " +
                "league's First Team in '98, he would be selected to the First Team seven more times—every year from 2000 to 2006.) In 2000, " +
                "Shaq was named the NBA's Most Valuable Player.");
        p.setImg(R.drawable.shaquille_oneal);
        players.add(p);


        return players;
    }



}