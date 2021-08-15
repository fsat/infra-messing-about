package au.id.fsat.infra.aws.common

trait ResourceInRegion[R <: Region] {
  def region: R
}
