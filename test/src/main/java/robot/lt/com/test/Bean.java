package robot.lt.com.test;

import java.util.List;

/**
 * Created by help on 2015-10-14.
 */
public class Bean {
    public int company_id;
    public String sub_gymnasium_type;
    public LocationEntity location;
    public int gym_id;
    public String subgym_name;
    public int id;
    public int city_id;
    public String hold_status;
    public String distance;
    public String rank;
    public int min_price;
    public String holiday_start_operation_time;
    public List<FacilitiesEntity> facilities;
    public String holiday_end_operation_time;
    public String start_operation_time;
    public String ground_material;
    public String cbd_id;
    public String picture_url;
    public String floor_height;
    public int activity_id;
    public String traffic_info;
    public int province_id;
    public int district_id;
    public String environment;
    public String address;
    public int refund_lead_day;
    public String end_operation_time;
    public int max_price;
    public int field_count;
    public int booking_lead_day;
    public String mobile;
    public class LocationEntity {
        /**
         * lon : 121.551468
         * lat : 31.283561
         */
        public String lon;
        public String lat;
    }
    public class FacilitiesEntity {
        public int id;
        public String picture_url;
        public String facility_name;
    }
}
