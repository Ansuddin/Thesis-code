public class Policy
{
  static final public se.chalmers.paragon.runtime.LockID IsDoctor = new se.chalmers.paragon.runtime.LockID("IsDoctor");
  static final public se.chalmers.paragon.runtime.LockID IsReferred = new se.chalmers.paragon.runtime.LockID("IsReferred", Doctor.class);
  static final public se.chalmers.paragon.runtime.LockID Referred = new se.chalmers.paragon.runtime.LockID("Referred");
  static final public se.chalmers.paragon.runtime.LockID OnlyMatrix = new se.chalmers.paragon.runtime.LockID("OnlyMatrix");
  public static final se.chalmers.paragon.runtime.Policy bottom = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {java.lang.Object.class}, new se.chalmers.paragon.runtime.Variable(0)));
  public static final se.chalmers.paragon.runtime.Policy top = new se.chalmers.paragon.runtime.Policy();
  private static final java.lang.Object untrustedObserver = new java.lang.Object();
  private static final java.lang.Object trustedObserver = new java.lang.Object();
  private static final java.lang.Object mostTrustedObserver = new java.lang.Object();
  static final private se.chalmers.paragon.runtime.LockID endorseLock = new se.chalmers.paragon.runtime.LockID("endorseLock");
  public static final se.chalmers.paragon.runtime.Policy untrusted = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(untrustedObserver)), new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(trustedObserver), new se.chalmers.paragon.runtime.Atom(endorseLock)));
  public static final se.chalmers.paragon.runtime.Policy trusted = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(untrustedObserver)), new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(trustedObserver)));
  public static final se.chalmers.paragon.runtime.Policy mostTrusted = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(untrustedObserver)), new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(trustedObserver)), new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(mostTrustedObserver)));
  public static <A> A endorse(A x)
  {
    {
      return x;
    }
  }
  static final private se.chalmers.paragon.runtime.LockID declassifyLock = new se.chalmers.paragon.runtime.LockID("declassifyLock");
  public static final se.chalmers.paragon.runtime.Policy lowD = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {Doctor.class}, new se.chalmers.paragon.runtime.Variable(0)), new se.chalmers.paragon.runtime.Clause(new Class<?>[] {Secretary.class}, new se.chalmers.paragon.runtime.Variable(0)), new se.chalmers.paragon.runtime.Clause(new Class<?>[] {java.lang.Object.class}, new se.chalmers.paragon.runtime.Variable(0), new se.chalmers.paragon.runtime.Atom(declassifyLock)));
  public static final se.chalmers.paragon.runtime.Policy mediumD = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {Doctor.class}, new se.chalmers.paragon.runtime.Variable(0)), new se.chalmers.paragon.runtime.Clause(new Class<?>[] {java.lang.Object.class}, new se.chalmers.paragon.runtime.Variable(0), new se.chalmers.paragon.runtime.Atom(declassifyLock)));
  public static final se.chalmers.paragon.runtime.Policy highD = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {Doctor.class}, new se.chalmers.paragon.runtime.Variable(0), new se.chalmers.paragon.runtime.Atom(IsReferred, new se.chalmers.paragon.runtime.Variable(0))), new se.chalmers.paragon.runtime.Clause(new Class<?>[] {java.lang.Object.class}, new se.chalmers.paragon.runtime.Variable(0), new se.chalmers.paragon.runtime.Atom(declassifyLock)));
  public static <A> A declassifyLow(A x)
  {
    {
      return x;
    }
  }
  public static <A> A declassifyMedium(A x)
  {
    {
      return x;
    }
  }
  public static <A> A declassifyHigh(final se.chalmers.paragon.runtime.Policy TO, A x)
  {
    {
      return x;
    }
  }
}