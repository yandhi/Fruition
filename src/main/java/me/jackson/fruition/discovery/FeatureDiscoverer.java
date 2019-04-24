package me.jackson.fruition.discovery;

import me.jackson.fruition.feature.Feature;

import java.util.Map;
import java.util.Optional;

/**
 * Discovers features for the API.
 *
 * @author Jax
 * Created in Apr 2019
 */
public final class FeatureDiscoverer {

    /**
     * Discovers the provided feature based on provided name.
     *
     * @param features The collection of features.
     * @param feature  The feature's name to be found.
     * @return An {@link Optional} instance of the feature.
     */
    public Optional<Feature> discoverFeature(Map<String, Feature> features, String feature) {
        return Optional.ofNullable(features.get(feature.toLowerCase()));
    }
}
