public class JournalPolicy
{
  private static final Secretary secretary;
  private static final Doctor doctor;
  public static final se.chalmers.paragon.runtime.Policy high = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(doctor)));
  public static final se.chalmers.paragon.runtime.Policy low = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(secretary)), new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(doctor)));
}