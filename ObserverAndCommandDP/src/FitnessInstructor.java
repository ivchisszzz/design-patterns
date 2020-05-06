
public class FitnessInstructor {

  private Trainer trainer;

  public FitnessInstructor(Trainer trainer) {
    this.trainer = trainer;
  }

  public void performExercise(Exercise exercise) {
    trainer.showExercise(exercise);
  }

}
