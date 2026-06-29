class Solution(object):
    def earliestFinishTime(self, landStartTime, landDuration, waterStartTime, waterDuration):

        def calculate(start1, duration1, start2, duration2):
            # Find the absolute earliest we can finish the first task
            earliest_end_time = min(start1[i] + duration1[i] for i in range(len(start1)))

            min_time = float("inf")
            
            # Find the best second task based on when we finished the first
            for i in range(len(start2)):
                late_end_time = max(earliest_end_time, start2[i]) + duration2[i]
                min_time = min(min_time, late_end_time)

            return min_time


        # Scenario 1: Land -> Water
        land_to_water = calculate(landStartTime, landDuration, waterStartTime, waterDuration)

        # Scenario 2: Water -> Land
        water_to_land = calculate(waterStartTime, waterDuration, landStartTime, landDuration)

        return min(land_to_water, water_to_land)

        """
        :type landStartTime: List[int]
        :type landDuration: List[int]
        :type waterStartTime: List[int]
        :type waterDuration: List[int]
        :rtype: int
        """
        