package au.id.fsat.infra.aws.common

trait ResourceInAvailabilityZone[AZ <: Region.AvailabilityZone, R <: Region] extends ResourceInRegion[R] {
  def az: AZ
}
