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
        val name = s"${region.name}a"
        val region = UsWest2
      }

      case object UsWest2b extends UsWest2a
      trait UsWest2b extends UsWest2AvailabilityZone {
        val name = s"${region.name}a"
        val region = UsWest2
      }

      case object UsWest2c extends UsWest2a
      trait UsWest2c extends UsWest2AvailabilityZone {
        val name = s"${region.name}a"
        val region = UsWest2
      }
    }

    sealed trait UsWest2AvailabilityZone extends AvailabilityZone
  }
  sealed trait UsWest2 extends Region

  sealed trait AvailabilityZone {
    def name: String
    def region: Region
  }
}

sealed trait Region {
  def name: String
  def availabilityZones: Set[Region.AvailabilityZone]
}
