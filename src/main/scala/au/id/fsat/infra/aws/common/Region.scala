package au.id.fsat.infra.aws.common

object Region {
  case object UsWest2 extends UsWest2 {
    val name = "us-west-2"
    val availabilityZones = Set(
      AvailabilityZones.UsWest2a,
      AvailabilityZones.UsWest2b,
      AvailabilityZones.UsWest2c)

    object AvailabilityZones {
      case object UsWest2a extends UsWest2a
      trait UsWest2a extends UsWest2AvailabilityZone {
        val region = UsWest2
        val name = s"${region.name}a"
      }

      case object UsWest2b extends UsWest2a
      trait UsWest2b extends UsWest2AvailabilityZone {
        val region = UsWest2
        val name = s"${region.name}a"
      }

      case object UsWest2c extends UsWest2a
      trait UsWest2c extends UsWest2AvailabilityZone {
        val region = UsWest2
        val name = s"${region.name}a"
      }
    }

    sealed trait UsWest2AvailabilityZone extends AvailabilityZone[UsWest2]
  }
  sealed trait UsWest2 extends Region[UsWest2]

  sealed trait AvailabilityZone[R <: Region[R]] {
    def name: String
    def region: R
  }
}

sealed trait Region[Self <: Region[Self]] {
  def name: String
  def availabilityZones: Set[Region.AvailabilityZone[Self]]
}
