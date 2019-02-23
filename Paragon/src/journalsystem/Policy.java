public class Policy
{
  private static final java.lang.Object lowObserver = new java.lang.Object();
  private static final java.lang.Object highObserver = new java.lang.Object();
  private static final java.lang.Object untrustedObserver = new java.lang.Object();
  private static final java.lang.Object trustedObserver = new java.lang.Object();
  public static final se.chalmers.paragon.runtime.Policy untrusted = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(untrustedObserver)));
  public static final se.chalmers.paragon.runtime.Policy trusted = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(untrustedObserver)), new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(trustedObserver)));
  public static final se.chalmers.paragon.runtime.Policy high = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(highObserver)));
  public static final se.chalmers.paragon.runtime.Policy low = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(lowObserver)), new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(highObserver)));
  private static final Doctor doctor = new Doctor();
  private static final Secretary secretary = new Secretary();
  private static final MatrixService matrix = new MatrixService();
  public static final se.chalmers.paragon.runtime.Policy high2 = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(matrix)), new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(doctor)));
  public static final se.chalmers.paragon.runtime.Policy low2 = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(matrix)), new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(doctor)), new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(secretary)));
}