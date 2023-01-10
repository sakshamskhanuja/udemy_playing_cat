## Playing Cat

### Description

The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive). Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.

Write a method <b>isCatPlaying</b> that has 2 parameters. Method needs to return <b>true</b> if the cat is playing, otherwise return <b>false</b>. 1st parameter should be of type <b>boolean</b> and be named <b>summer</b> it represents if it is summer. 2nd parameter represents the temperature and is of type <b>int</b> with the name <b>temperature.</b>

### Examples of input/output

<ul>
<li>isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45 </li>
<li>isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)</li>
<li>isCatPlaying(false, 35); should return true since temperature is in range 25 - 35 </li>
</ul>
