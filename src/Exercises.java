public class Exercises implements ExercisesInterface{
    public static void closeGripBenchPress(){
        System.out.println("Lie back on a flat bench. Using a close grip (around shoulder width), lift the bar from the rack and hold it straight over you with your arms locked. This will be your starting position.\n" +
                "As you breathe in, come down slowly until you feel the bar on your middle chest. Tip: Make sure that - as opposed to a regular bench press - you keep the elbows close to the torso at all times in order to maximize triceps involvement.\n" +
                "After a second pause, bring the bar back to the starting position as you breathe out and push the bar using your triceps muscles. Lock your arms in the contracted position, hold for a second and then start coming down slowly again. Tip: It should take at least twice as long to go down than to come up.\n" +
                "Repeat the movement for the prescribed amount of repetitions.\n" +
                "When you are done, place the bar back in the rack.");
        return;

    }

    public static void inclinePress(){
        System.out.println("Lie on a bench set to a 45-degree incline, holding a pair of dumbbells at arm’s length above your chest, palms forward.\n" +
                "Keeping your core braced and your elbows close to your body (i.e., not flared), lower the dumbbells to the sides of your chest.\n" +
                "Pause, and then push the weights back up to the starting position.\n"+"\n"+"\n");
        return;
    }
    public static void declinePress(){
        System.out.println("A spotter or smith machine is recommended for safety.\n" +
                "Use a decline bench station or decline bench/power rack combination.\n" +
                "Position the barbell at the correct reach level on the rack (you are able to grip/lift the bar off rack with assistance).\n" +
                "Load weight resistance appropriate to your fitness level on the barbell.\n" +
                "Secure your feet at the end of the decline bench and slowly lay down on the bench.\n" +
                "Avoid hitting your head on the bar as you lower your body down.\n" +
                "Grab the bar using a regular/standard, slightly wider than shoulder-width hand grip.\n" +
                "Unrack the weighted bar with spotter assistance.\n" +
                "Slowly lower the bar to your chest, inhaling during this part of the motion.\n" +
                "Raise the bar with an explosive push to start position, exhaling during this part of the motion.\n" +
                "Repeat the exercise for a determined amount of reps.\n" +
                "Tighten your core, keep chin tucked, exhale and lift your body up grabbing footholds to get off the bench.");
        return;
    }
    public static void pushUps(){
        System.out.println ("Get on the floor on all fours, positioning your hands slightly wider than your shoulders.\n" +
                "Extend your legs back so that you are balanced on your hands and toes. Keep your body in a straight line from head to toe without sagging in the middle or arching your back. You can position your feet to be close together or a bit wider depending on what is most comfortable for you.\n" +
                "Before you begin any movement, contract your abs and tighten your core by pulling your belly button toward your spine. Keep a tight core throughout the entire pushup.\n" +
                "Inhale as you slowly bend your elbows and lower yourself until your elbows are at a 90-degree angle.\n" +
                "Exhale as you begin contracting your chest muscles and pushing back up through your hands to the start position. Don't lock out the elbows; keep them slightly bent.");
        return;
    }
    public static void parallelBarDips(){
        System.out.println("Grab the parallel bars and jump up, straighten your arms\n" +
                "Lower your body by bending your arms while leaning forward\n" +
                "Dip down until your shoulders are below your elbows\n" +
                "Lift your body up by straightening your arms\n" +
                "Lock your elbows at the top\n");
        return;
    }
    public static void dumbellPress(){
        System.out.println ("Lie down on a flat bench with a dumbbell in each hand resting on top of your thighs. The palms of your hands will be facing each other.\n" +
                "Then, using your thighs to help raise the dumbbells up, lift the dumbbells one at a time so that you can hold them in front of you at shoulder width.\n" +
                "Once at shoulder width, rotate your wrists forward so that the palms of your hands are facing away from you. The dumbbells should be just to the sides of your chest, with your upper arm and forearm creating a 90 degree angle. Be sure to maintain full control of the dumbbells at all times. This will be your starting position.\n" +
                "Then, as you breathe out, use your chest to push the dumbbells up. Lock your arms at the top of the lift and squeeze your chest, hold for a second and then begin coming down slowly. Tip: Ideally, lowering the weight should take about twice as long as raising it.\n" +
                "Repeat the movement for the prescribed amount of repetitions of your training program.");

        return;
    }

    @Override
    public int reps() {
        int repeats=8;
        return repeats;
    }

    @Override
    public int sets() {
        int sets=4;
        return sets;
    }

    @Override
    public String rest() {
        String rest ="Rest for 4 minutes";
        return rest;
    }


}
