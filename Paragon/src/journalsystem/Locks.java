public class Locks
{
  static final public se.chalmers.paragon.runtime.LockID IsDoctor = new se.chalmers.paragon.runtime.LockID("IsDoctor");
  static final public se.chalmers.paragon.runtime.LockID IsReferred = new se.chalmers.paragon.runtime.LockID("IsReferred", Doctor.class);
  static final public se.chalmers.paragon.runtime.LockID Referred = new se.chalmers.paragon.runtime.LockID("Referred");
  static final public se.chalmers.paragon.runtime.LockID OnlyMatrix = new se.chalmers.paragon.runtime.LockID("OnlyMatrix");
}