/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.storagegateway.model;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#describeCachediSCSIVolumes(DescribeCachediSCSIVolumesRequest) DescribeCachediSCSIVolumes operation}.
 * <p>
 * This operation returns a description of the gateway volumes specified in the request. This operation is supported only for the gateway-cached volume
 * architecture.
 * </p>
 * <p>
 * The list of gateway volumes in the request must be from one gateway. In the response Amazon Storage Gateway returns volume information sorted by
 * volume Amazon Resource Name (ARN).
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#describeCachediSCSIVolumes(DescribeCachediSCSIVolumesRequest)
 */
public class DescribeCachediSCSIVolumesRequest extends AmazonWebServiceRequest  implements Serializable  {

    /**
     * An array of strings, where each string represents the Amazon Resource
     * Name (ARN) of a cached volume. All of the specified cached volumes
     * must be from the same gateway. Use <a>ListVolumes</a> to get volume
     * ARNs of a gateway.
     */
    private java.util.List<String> volumeARNs;

    /**
     * An array of strings, where each string represents the Amazon Resource
     * Name (ARN) of a cached volume. All of the specified cached volumes
     * must be from the same gateway. Use <a>ListVolumes</a> to get volume
     * ARNs of a gateway.
     *
     * @return An array of strings, where each string represents the Amazon Resource
     *         Name (ARN) of a cached volume. All of the specified cached volumes
     *         must be from the same gateway. Use <a>ListVolumes</a> to get volume
     *         ARNs of a gateway.
     */
    public java.util.List<String> getVolumeARNs() {
        
        if (volumeARNs == null) {
            volumeARNs = new java.util.ArrayList<String>();
        }
        return volumeARNs;
    }
    
    /**
     * An array of strings, where each string represents the Amazon Resource
     * Name (ARN) of a cached volume. All of the specified cached volumes
     * must be from the same gateway. Use <a>ListVolumes</a> to get volume
     * ARNs of a gateway.
     *
     * @param volumeARNs An array of strings, where each string represents the Amazon Resource
     *         Name (ARN) of a cached volume. All of the specified cached volumes
     *         must be from the same gateway. Use <a>ListVolumes</a> to get volume
     *         ARNs of a gateway.
     */
    public void setVolumeARNs(java.util.Collection<String> volumeARNs) {
        if (volumeARNs == null) {
            this.volumeARNs = null;
            return;
        }

        java.util.List<String> volumeARNsCopy = new java.util.ArrayList<String>(volumeARNs.size());
        volumeARNsCopy.addAll(volumeARNs);
        this.volumeARNs = volumeARNsCopy;
    }
    
    /**
     * An array of strings, where each string represents the Amazon Resource
     * Name (ARN) of a cached volume. All of the specified cached volumes
     * must be from the same gateway. Use <a>ListVolumes</a> to get volume
     * ARNs of a gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeARNs An array of strings, where each string represents the Amazon Resource
     *         Name (ARN) of a cached volume. All of the specified cached volumes
     *         must be from the same gateway. Use <a>ListVolumes</a> to get volume
     *         ARNs of a gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCachediSCSIVolumesRequest withVolumeARNs(String... volumeARNs) {
        if (getVolumeARNs() == null) setVolumeARNs(new java.util.ArrayList<String>(volumeARNs.length));
        for (String value : volumeARNs) {
            getVolumeARNs().add(value);
        }
        return this;
    }
    
    /**
     * An array of strings, where each string represents the Amazon Resource
     * Name (ARN) of a cached volume. All of the specified cached volumes
     * must be from the same gateway. Use <a>ListVolumes</a> to get volume
     * ARNs of a gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeARNs An array of strings, where each string represents the Amazon Resource
     *         Name (ARN) of a cached volume. All of the specified cached volumes
     *         must be from the same gateway. Use <a>ListVolumes</a> to get volume
     *         ARNs of a gateway.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCachediSCSIVolumesRequest withVolumeARNs(java.util.Collection<String> volumeARNs) {
        if (volumeARNs == null) {
            this.volumeARNs = null;
        } else {
            java.util.List<String> volumeARNsCopy = new java.util.ArrayList<String>(volumeARNs.size());
            volumeARNsCopy.addAll(volumeARNs);
            this.volumeARNs = volumeARNsCopy;
        }

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVolumeARNs() != null) sb.append("VolumeARNs: " + getVolumeARNs() + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeARNs() == null) ? 0 : getVolumeARNs().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCachediSCSIVolumesRequest == false) return false;
        DescribeCachediSCSIVolumesRequest other = (DescribeCachediSCSIVolumesRequest)obj;
        
        if (other.getVolumeARNs() == null ^ this.getVolumeARNs() == null) return false;
        if (other.getVolumeARNs() != null && other.getVolumeARNs().equals(this.getVolumeARNs()) == false) return false; 
        return true;
    }
    
}
    