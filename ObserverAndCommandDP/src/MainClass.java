public class MainClass {

  public static void main(String[] args) {
    Trainer trainer = new Trainer();
    FitnessInstructor fitnessInstructor = new FitnessInstructor(trainer);

    Viewer firstViewer = new Viewer("Ivan");
    Viewer secondViewer = new Viewer("Dragan");
    Viewer thirdViewer = new Viewer("Petkan");


    trainer.addObserver(secondViewer);
    trainer.addObserver(firstViewer);
    trainer.addObserver(thirdViewer);

    fitnessInstructor.performExercise(new GetUpExercise());

    fitnessInstructor.performExercise(new LieDownExercise());

    fitnessInstructor.performExercise(new GetUpExercise());


  }

}
