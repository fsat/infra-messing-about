package au.id.fsat.infra.aws.common

trait ResourceInRegion[R <: Region[R]] {
  def region: R
}
