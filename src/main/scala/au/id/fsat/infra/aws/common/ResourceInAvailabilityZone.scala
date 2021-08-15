package au.id.fsat.infra.aws.common

trait ResourceInAvailabilityZone[R <: Region[R], AZ <: Region.AvailabilityZone[R]] extends ResourceInRegion[R] {
  def az: AZ
}
