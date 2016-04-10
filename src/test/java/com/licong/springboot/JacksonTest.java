package com.licong.springboot;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;

import java.io.IOException;

/**
 * Created by lctm2005 on 2015/10/1.
 */
public class JacksonTest {

    public static void main(String[] args) throws IOException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        ReadButDontWriteProps readButDontWriteProps = new ReadButDontWriteProps("licong");
        mapper.readerForUpdating(readButDontWriteProps).readValue("{\"name\":\"nihao\"}");
        System.out.println(mapper.writeValueAsString(readButDontWriteProps));
    }

    @AllArgsConstructor
    public static class ReadButDontWriteProps {
        @JsonIgnore
        private String name;

        @JsonIgnore
        public void setName(String name) {
            name = name;
        }

        @JsonProperty
        public String getName() {
            return name;
        }
    }

}
